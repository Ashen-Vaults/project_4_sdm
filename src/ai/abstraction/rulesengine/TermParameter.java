/*
 *
 */
package ai.abstraction.rulesengine;

/**
 * Example:
 *      termA = fighter(x,self)
 *      
 *      fighter = functor
 *      
 *      new TermParamter: x
 *      _parameter = x,
 *      _unboundVariable = true
 *
 *      new TermParamter: self
 *      _parameter = self,
 *      _unboundVariable = false
 * 
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


