/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118.factory;

import static ch13_20200118.factory.Animal.CAT;
import static ch13_20200118.factory.Animal.DOG;
//工廠模式測試
/**
 *
 * @author xvpow
 */
//java 8 之前的寫法
public class AnimalFacoty {
      public static  Animal createAnimal(int type,String name,
	      int age){
	switch(type){
	    case DOG:
		return new Dog(name,age);
	    case CAT:
		return new Cat(name,age);
	}
      return null;
  }
}
