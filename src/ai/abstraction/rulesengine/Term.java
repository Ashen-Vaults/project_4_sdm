/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.abstraction.rulesengine;

import java.util.ArrayList;

/**
 * Knoweledge base implementaion
 * A representation of a logical term
 * 
 * Example: 
 *      fighter(X,self)
 *          
 *          functor = fighter
 *          arguments = x, self
 *              x.unboundVariable = true
 *              self.unboundVariable = false;
 * 
 * 
 * @author Alexsh
 */
public class Term {
    String functor; //Head of the 
    TermParameter[] arguments;
    
    public Term(String _f, TermParameter... _args){
        this.functor = _f;
        this.arguments = _args;
    }
    
}
