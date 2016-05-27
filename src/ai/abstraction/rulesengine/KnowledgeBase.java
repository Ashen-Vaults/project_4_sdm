/*
 * The database containing knowledge available to
 * the AI
 */
package ai.abstraction.rulesengine;

import java.util.ArrayList;

/**
 * The perception module will fill
 * the knowledge base each update cycle
 * @author Alexsh
 */
public class KnowledgeBase {
    ArrayList<Term> _facts;
    
    
    public KnowledgeBase(){
        _facts = new ArrayList<>();
    }
    
    public ArrayList<Term> getFacts(){
        return _facts;
    }
    
    public void addTerm(Term _t){
        _facts.add(_t);
    }
    
    public void clear(){
        _facts.clear();
    }
    
}
