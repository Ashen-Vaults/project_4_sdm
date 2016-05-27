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
public class And extends Match {
    Match _match1;
    Match _match2;
    
    @Override
    public boolean matches(KnowledgeBase _kb){ 
        return _match1.matches(_kb) && _match2.matches(_kb);
    }
}
