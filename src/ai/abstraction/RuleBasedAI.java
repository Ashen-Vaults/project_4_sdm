/*
 * [x] = completed
 *
 * Requirements Checklist
 *  Rule Based System
 *       1. Knowledge Base
 *       2. 


 *       2. Inference Engine 
 *           a. Implements a form of unification 
 *               i. Optional: variables 
 *           b. Provenance info to verify it is still valid
 *
 *       3. Rule Base
 *           a. Cannot be hardcoded if-then-logic
 *           b. Classes for how to store rules
 */
package ai.abstraction;

import ai.abstraction.pathfinding.AStarPathFinding;
import ai.abstraction.pathfinding.PathFinding;
import ai.abstraction.rulesengine.InferenceEngine;
import ai.abstraction.rulesengine.KnowledgeBase;
import ai.abstraction.rulesengine.Rule;
import ai.core.AI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import rts.GameState;
import rts.PhysicalGameState;
import rts.Player;
import rts.PlayerAction;
import rts.units.Unit;
import rts.units.UnitType;
import rts.units.UnitTypeTable;


public class RuleBasedAI extends AbstractionLayerAI {

    Random r = new Random();
    UnitTypeTable utt;
    UnitType workerType;
    UnitType baseType;
    UnitType barracksType;
    UnitType lightType;
    
    ArrayList<Rule> _rules;
    KnowledgeBase _myKnowledge;
    InferenceEngine _inferenceEngine;
      
    public RuleBasedAI(UnitTypeTable a_utt, PathFinding a_pf) {
        super(a_pf);
        utt = a_utt;
        workerType = utt.getUnitType("Worker");
        baseType = utt.getUnitType("Base");
        barracksType = utt.getUnitType("Barracks");
        lightType = utt.getUnitType("Light");
        
        _inferenceEngine = new InferenceEngine();
        _myKnowledge = new KnowledgeBase();
        _rules = new ArrayList<>();
        
        _rules.add(new Rule("@can_command @barracks AND "   + //is a barracks you can command
                            "@light_capacity AND "          + //and light capacity has been reached
                            "@busy true NE AND"             + //and isn't busy
                            "@heavy_capacity true NE AND "  + //and heavy capacity hasn't been reached
                            "@afford_heavy AND",              //and you can afford heavy 
                            this._myKnowledge));
        
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AI clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
        This is the main function of the AI. It is called at each game cycle with the most up to date game state and
        returns which actions the AI wants to execute in this cycle.
        The input parameters are:
        - player: the player that the AI controls (0 or 1)
        - gs: the current game state
        This method returns the actions to be sent to each of the units in the gamestate controlled by the player,
        packaged as a PlayerAction.
     */
    public PlayerAction getAction(int player, GameState gs) {
        PhysicalGameState pgs = gs.getPhysicalGameState();
        Player p = gs.getPlayer(player);
        
        //this._myKnowledge.clear();
        
        this._inferenceEngine.ruleBasedSystemIteration(_rules, _myKnowledge);
        
        //this._myKnowledge.addTerm(_t);

        // behavior of bases:
        for (Unit u : pgs.getUnits()) {
            if (u.getType() == baseType
                    && u.getPlayer() == player
                    && gs.getActionAssignment(u) == null) {
                //baseBehavior(u, p, pgs);
            }
        }

        // behavior of barracks:
        for (Unit u : pgs.getUnits()) {
            if (u.getType() == barracksType
                    && u.getPlayer() == player
                    && gs.getActionAssignment(u) == null) {
                //barracksBehavior(u, p, pgs);
            }
        }

        // behavior of melee units:
        for (Unit u : pgs.getUnits()) {
            if (u.getType().canAttack && !u.getType().canHarvest
                    && u.getPlayer() == player
                    && gs.getActionAssignment(u) == null) {
                //meleeUnitBehavior(u, p, pgs);
            }
        }

        // behavior of workers:
        List<Unit> workers = new LinkedList<Unit>();
        for (Unit u : pgs.getUnits()) {
            if (u.getType().canHarvest
                    && u.getPlayer() == player) {
                workers.add(u);
            }
        }
        
        //workersBehavior(workers, p, pgs);

        // This method simply takes all the unit actions executed so far, and packages them into a PlayerAction
        return translateActions(player, gs);
    }
}
