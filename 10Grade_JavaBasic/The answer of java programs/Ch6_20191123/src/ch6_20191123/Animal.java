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


//類別可以在沒抽象方法之前可選擇是否抽象
//類別中有抽象方法 類別必須抽象
//抽象 類別不可final
//抽象方法不可為final 與 private
public  abstract class Animal {
    private String name;
    private int age;
    private float height;
    public Animal(String name,int age,float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String toString(){
        return name+":"+age+":"+height;
    }
    public abstract void skill();
    
}
