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
public enum EffectType {
    NONE        (0),
    ACTION      (1),
    NEW_TERM    (2);
    
    private int numVal;

    EffectType (int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
