/*
 *
 */
package ai.abstraction.rulesengine;

/**
 *
 * @author Alexsh
 */
public class TermParameter {
    String _parameter;
    boolean _unboundVariable; 
    
    public TermParameter(String _param, boolean _isVar){
        this._parameter = _param;
        this._unboundVariable = _isVar;
    }
    
}


