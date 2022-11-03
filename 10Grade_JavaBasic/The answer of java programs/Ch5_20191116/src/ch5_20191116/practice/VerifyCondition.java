/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116.practice;

/**
 *
 * @author xvpow
 */

class Condition{
    protected boolean context(float value){
        return false;
    }
}
public class VerifyCondition {
    private AnimalException aex;
    private  Condition cond;
    public VerifyCondition(AnimalException aex,
                        Condition cond){
        this.aex = aex;
        this.cond = cond;
    }
    public boolean condition(float value){
        if (!cond.context(value)){
            throw aex;
        }
        return true;
    }
}
