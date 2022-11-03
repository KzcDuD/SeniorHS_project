/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118.factory;
//工廠模式測試
/**
 *
 * @author xvpow
 */
public interface Animal {
    int DOG =1;
    int CAT = 2;
    String getName();
    int getAge();
   default public boolean isOld(){
	if (getAge() > 20){
	    return true;
	}
	return false;
    }
   //java 8開始的做法
  static public Animal createAnimal(int type,String name,int age){
	switch(type){
	    case DOG:
		return new Dog(name,age);
	    case CAT:
		return new Cat(name,age);
	}
      return null;
  }
   
    
}
