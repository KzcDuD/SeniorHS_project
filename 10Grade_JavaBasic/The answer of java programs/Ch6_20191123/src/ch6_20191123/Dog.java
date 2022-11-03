/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;

/**
 *
 * @author xvpow
 */
public  class Dog extends Animal {
    public Dog(String name,int age,float height){
        super(name,age,height);
    }
    public void skill(){
        System.out.println("嗅覺放大100萬倍");
    }
}
