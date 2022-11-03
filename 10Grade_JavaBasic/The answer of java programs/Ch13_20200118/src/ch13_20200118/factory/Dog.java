/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118.factory;

/**
 *
 * @author xvpow
 */
public class Dog  implements Animal{
    private String name;
    private int age;

     Dog(String name, int age) {
	this.name = name;
	this.age = age;
    }
    
   public  String getName()
   {
       return "Dog:"+name;
   }
   public int getAge(){
	return age;
    }
}
