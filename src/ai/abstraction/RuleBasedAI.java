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

import ai.abstraction.pathfinding.PathFinding;
import ai.core.AI;
import rts.GameState;
import rts.PlayerAction;


public class RuleBasedAI extends AbstractionLayerAI {

    public RuleBasedAI(PathFinding a_pf) {
        super(a_pf);
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AI clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlayerAction getAction(int player, GameState gs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
