/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;

import ch13_20200118.factory.Cat;
import ch13_20200118.factory.Animal;
import ch13_20200118.factory.AnimalFacoty;

/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    public static void main(String[] args) {
	//Factory 
	//簡化低耦合過程 
	Animal dog1=  AnimalFacoty.createAnimal(Animal.CAT, "MiMi", 2);
	System.out.println(dog1.getAge());
	System.out.println(dog1.getName());
	System.out.println(dog1.isOld());
	Animal dog2=  Animal.createAnimal(Animal.DOG, "LuLu", 5);
    }
    
}
