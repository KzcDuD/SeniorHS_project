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
public class Cat extends Animal {
    public Cat(String name,int age,float height,VerifyCondition vc){
        super(name,age,height,vc);
    }
    
     public void setHeight(float height){
      if (height < 0 || height > 100){
         throw new DogHeightException("身高不可小於0 大於 130");
        }
      super.setHeight(height);
    }
}
