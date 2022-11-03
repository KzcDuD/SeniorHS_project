/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20191102;

/**
 *
 * @author student
 */
public class Dog extends Animal{
    Dog(){
        
    }
    Dog(String name,int age ,float height){
        //super()呼叫父類別建構子
        //只能是建構子的第一條命令
        //不可與()同時呼叫
        super(name,age,height);
      /*  this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        System.out.println(name+":"+age+":"+height);
        */
    }
}
