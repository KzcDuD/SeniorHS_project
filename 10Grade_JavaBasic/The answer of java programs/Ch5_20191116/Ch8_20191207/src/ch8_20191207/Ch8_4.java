/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {
    static class DogCat extends Dog{
        public void bark(){
            System.out.println("喵喵!!");
        }
    }
    public static void main(String[] args) {
       Dog dog = new DogCat();
        dog.bark();
       
        Dog dog2 = new Dog(){
            public void bark(){
                System.out.println("支支!!");
            }
        };
       dog2.bark();
        
    }
    
}
