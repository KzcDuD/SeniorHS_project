/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_testjar;
import howard.test.pbj.Employee;
import java.util.TreeSet;
public class Ch10_TestJar {
    //第一招 使用內部類
      private static class MyEmployee extends Employee 
              implements Comparable<Employee>{
          public MyEmployee(String name,int salary,int year){
              super(name,salary,year);
          }
          public int compareTo(Employee emp){
              if (this.getSalary() > emp.getSalary()){
                  return 1;
              }else if(this.getSalary() < emp.getSalary()){
                  return -1;  
              }else if(this.getYear() > emp.getYear()){
                  return 1;
              }else if(this.getYear() < emp.getYear()){
                  return -1;
              }
              return this.getName().compareTo(emp.getName());
          }
      }
    
    public static void main(String[] args) {
      Employee emp1 = new MyEmployee("Vivin",200,20170506);
      Employee emp2 = new MyEmployee("Ken",150,20180506);
      Employee emp3 = new MyEmployee("Iris",150,20190506);
      Employee emp4 = new MyEmployee("Join",150,20190506);
      
//      System.out.println(emp1);
      TreeSet<Employee> set = new TreeSet<>();
      set.add(emp1);
      set.add(emp2);
      set.add(emp3);
      set.add(emp4);
      set.forEach(System.out::println);
    }
    
}
