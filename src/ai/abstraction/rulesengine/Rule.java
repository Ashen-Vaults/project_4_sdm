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
public class Rule {
    Term[] pattern;
    Term[] effect;
    
    //specifies whether the given effect is an action to be executed
    //or a new term to add to the knowledge base
    int[] effectType;
        
    
    
}
