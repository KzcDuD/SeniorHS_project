/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109;
public class Employee {
  
    private String id;
    private String name;
    private int age;
    private int salary;
    
     Employee(String name,String id,int age,int salary){
         this.name = name;
         this.id = id;
         this.age = age;
         this.salary = salary;
     }
    
     public void setName(String name){
         this.name = name;
     }
     public String getName(){
         return this.name;
     }
     public void setAge(int age){
         this.age = age;
     }
    public int getAge(){
        return age;
    } 
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getSalary(){
        return this.salary;
    }
    public void print(){
        System.out.printf("Id:%s Name:%s Age:%d Salary:%d %n",
                this.getId(),this.getName(),this.getAge(),this.getSalary());
    }
}
