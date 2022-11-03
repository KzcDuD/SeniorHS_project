/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109;

/**
 *
 * @author shihhaochiu
 */
public class Ch4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Name
        //ID
        //Age
        //Salary
        
        Employee emp1 =
                new Employee("Vivin","A0001",25,26000);
        emp1.setId("B025");
        emp1.print();
        
        Employee rd = new RD("Jack","RD001",30,56000,4000);
        rd.print();
    }
    
}
