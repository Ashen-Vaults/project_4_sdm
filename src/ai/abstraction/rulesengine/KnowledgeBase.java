/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.abstraction.rulesengine;

import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class KnowledgeBase {
    ArrayList<Term> facts;
    
    void addTerm(Term _t){
        facts.add(_t);
    }
    
    void clear(){
        facts.clear();
    }
    
}
