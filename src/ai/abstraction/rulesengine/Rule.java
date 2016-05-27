/*
 * The Set of IF-THEN rules
 * Rules can examine the knowledge database
 * to determine if their "if" condition is met.
 * Rules that have their conditions met are said to trigger.
 * A triggered rule may be selected to fire,
 * whereupon it's "THEN" component is executed.
 */
package ai.abstraction.rulesengine;

import Rules.IfClause;
import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class Rule {
    
    private IfClause _ifClause;

    public IfClause getIfClause() {
        return _ifClause;
    }

    public Term[] getPattern() {
        return pattern;
    }

    public Term[] getAction() {
        return action;
    }

    public EffectType[] getEffectType() {
        return effectType;
    }
    
    private ArrayList<Term> pattern; //if this pattern is satisfied in the game
    private ArrayList<Term> action;  //this is what is executed
    
    //specifies whether the given effect is an action to be executed
    //or a new term to add to the knowledge base
    private EffectType[] effectType;
    
    
    public Action _myAction;
    
    
    public Rule(String _pattern, KnowledgeBase _kb){
        
        
        //pattern.add(new Term());
        
    }
    
    public void ExecuteAction(ArrayList<Term> _terms){
        for(int i=0;i<=_terms.size() -1; i++){
            //_terms.get(i).
        }
    }
    
    
}
