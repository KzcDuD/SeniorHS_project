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
public class HR extends Employee{
    private int pay;
    public HR(String name,String id,
            int age,int salary,int pay){
        super(name,id,age,salary);
        
    }
     public void setPay(int pay){
        this.pay = pay;
    }
     public int getSalary(){
         return this.getSalary() + pay;
     }
    public void print(){
        System.out.print("Titiler:HR");
        super.print();
    }
}
