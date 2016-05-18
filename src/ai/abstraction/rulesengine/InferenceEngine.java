/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.abstraction.rulesengine;

/**
 *
 * @author Alexsh
 */
public class InferenceEngine {
    
    public Term unification(Term _ta, Term _tb){
        
        if(_ta.functor == null ? _tb.functor != null : !_ta.functor.equals(_tb.functor)) return null;
        if(_ta.arguments.length != _tb.arguments.length)                                 return null;
        
        for (int i = 1; i < _ta.arguments.length-1; i++) {
            if(_ta.arguments[i]._unboundVariable){} //Add binding (_ta(i),_tb(i))
            else if(_ta.arguments[i] != _tb.arguments[i]) return null;
        }
        //TEMP
        return null; //return (true,bidings)
    }
    
    public void ruleBasedSystemIteration(Rule[] _rules, KnowledgeBase _kb){
        
        Rule[] FiredRules;
        
        for(int i=0;i<=_rules.length-1;i++){
            //Term t = unification(_rules[i].pattern, _kb);
        }
        
    }
    
}
