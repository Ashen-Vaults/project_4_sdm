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
public class Not extends Match{
    Match _match;
    
    @Override
    public boolean matches(KnowledgeBase _kb){
        return !_match.matches(_kb);
    }
    
}
