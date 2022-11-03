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
public class DogHeightCondition extends Condition{
     protected boolean context(float height){
        if (height < 0 || height > 130){
            return false;
        }
        return true;
    }
}
