/*
 *
 */
package ai.abstraction.rulesengine;

import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class InferenceEngine {
    ArrayList<Rule> FiredRules = new ArrayList<>();
    ArrayList<TermParamater> Bindings = new ArrayList<>();
    /**
     * Used for wild card pattern matching
     * Uses a variable substitution to 
     * see if two terms match.
     * 
     * Example:
     * 
     * 1)
     *      _ta = functor F(X,1)
     *      _tb = functor F(a,Y)
     * 
     *      Unification = _tc = f(a,1)
     * 
     * 2)
     *      _ta = f(X,1)
     *      _tb = f(a,X)
     *  
     *      Unification = _tc = null -> does not unify
     *      X needs to be equal to both a & 1 for this to be true,
     *      X CAN ONLY BE EQUAL TO 1 jawn
     * 
     * 3)
     *      _ta = f(X,1)
     *      _tb = g(a,Y)
     *  
     *      Unification = _tc = null -> does not unify
     *      the functors for _ta and _tb are not equal
     * 
     * @param _ta First Term
     * @param _tb Second Term
     * @return 
     */
    public Term unification(Term _ta, Term _tb){
        
        ArrayList<Term> bindings = new ArrayList<>();
        
        //If the functors are not the same then we already fail
        if(_ta.functor == null ? _tb.functor != null : !_ta.functor.equals(_tb.functor)) return null;
        
        //If the number of arguments for each term are different, then return false
        if(_ta.arguments.length != _tb.arguments.length)                                 return null;
        
        //If passes ^ then go arg by arg and check
        for (int i = 1; i < _ta.arguments.length-1; i++) {
            
            //Add binding (_ta(i),_tb(i))
            if(_ta.arguments[i]._unboundVariable){
                //bindings.add(_ta.arguments[i])
            } 
            
            //if they are not an unbound variable or equal to each other, we fail
            else if(_ta.arguments[i] != _tb.arguments[i]) return null;
        }
        //TEMP
        return null; //return (true,bidings)
    }
   
    /** 
     * This is called each time the AI is updated
     * @param _rules
     * @param _kb 
     */
    public void ruleBasedSystemIteration(ArrayList<Rule> _rules, KnowledgeBase _kb){
        
        //The rules to be called during this game frame update
        FiredRules.clear();
        
        //For each rule, if they match in the knowledge base
        for(int i=0;i<=_rules.size()-1;i++){
            
            //if rule matches, theyn it is fired -> add to firedrules
            //Term t = unification(_rules.get(i).pattern[i], _kb);
            
            Bindings.clear();
            
            if(_rules.get(i).getIfClause().matches(_kb)){
                    //Applies applies the bindings to the effects of the rule
                    //Replaces all the variables with the values
                    //FiredRules.add(instantiate(_rules[i], bindings)) ;
                
            }
            

            
            //Cannot fire more than rule at once, so arbitrate will select the rule
            //that we fire
            //RulesToExecute = arbitrate(FiredRules);
            
            
            
            /*
            foreach(Rule _ruleToExecute in RulesToExcecute){
                Execute(_ruleToExecute.action);
            }
            */
            
        }
        
    }
    
}
