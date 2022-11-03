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
public class Animal {
    private String name;
    private int age;
    private float height;
    private VerifyCondition hvc;
     
    
    public Animal(String name,int age,float height
            ,VerifyCondition hvc){
        this.hvc = hvc;
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
    
        
    }
    public void setHeightVC(VerifyCondition hvc){
          this.hvc = hvc;
    }
    public void setName(String name){
        this.name = name;
    }
      public void setAge(int age){
        this.age = age;
    }
      public void setHeight(float height){
          verifyHeight(height);
          this.height = height;
      }
      
      
    private boolean verifyHeight(float height){
            hvc.condition(height);
          return true;
      }
    
    public String getName(){
        return this.name;
    }
        public float getHeight(){
        return this.height;
    }
}
