/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118.factory;
public class Cat implements Animal {
    private String name;
    private int age;

     Cat(String name, int age) {
	this.name = name;
	this.age = age;
    }
    
   public  String getName()
   {
       return "Cat:"+name;
   }
   public int getAge(){
	return age;
    }
}
