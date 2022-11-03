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
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal dog = new Dog("Sonpy" ,50, 10);
        Animal cat = new Cat("Doramo",40,110);
        dog.print();
        cat.print();
        
    }
    
}
