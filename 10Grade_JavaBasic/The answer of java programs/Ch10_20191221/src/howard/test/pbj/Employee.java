/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howard.test.pbj;

public class Employee {
   private String name;
   private int salary;
   private int year;  
   
   public Employee(String name,int salary,int year){
       this.name = name;
       this.salary = salary;
       this.year = year;
   }
   public String getName(){
       return this.name;
   }
    public int getSalary(){
       return this.salary;
   }
   public int getYear(){
       return this.year;
   }
   
   public String toString(){
      return this.getName()+":"+
              this.getSalary()+":"+this.getYear();
   }
   
}
