/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rules;

import ai.abstraction.rulesengine.KnowledgeBase;

/**
 *
 * @author Alexsh
 */
public class Match implements IfClause{
    
    @Override
    public boolean matches(KnowledgeBase _kb){
        for(int i=0;i<=_kb.getFacts().size()-1;i++){
            //TODO: 
            return true;
        }
        return false;
    }
    
}
