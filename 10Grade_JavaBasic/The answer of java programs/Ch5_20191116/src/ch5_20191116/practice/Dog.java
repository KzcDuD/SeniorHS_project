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
public class Dog extends Animal{
    
    public Dog(String name,int age,
            float height,VerifyCondition hvc){
        super(name,age,height,hvc);      
    }
    
//    public void setHeight(float height){
//      if (height < 0 || height > 130){
//         throw new DogHeightException("身高不可小於0 大於 130");
//        }
//      super.setHeight(height);
//    }
    
}
