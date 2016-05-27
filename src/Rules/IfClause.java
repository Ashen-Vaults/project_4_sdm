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
public interface IfClause {
    
    boolean matches(KnowledgeBase _kb);
    
}
