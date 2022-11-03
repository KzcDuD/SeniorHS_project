/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;
public class Employee {
  private String name;
  private int age;
  private int salary;
  private int[] todoList = new int[31];
  private static int[] kpis = new int[100];
  
  
  //初始化區塊 非靜態 會在Constructor之前執行
  {
     for (int i = 0; i < todoList.length;i++){
            todoList[i] = -20;
      }
  }

 static {
   for (int i = 0; i < kpis.length;i++){
            kpis[i] = -1;
      }     
  
  }
  
  
   public Employee(String name,int age,int salary){
       this.name = name;
       this.age = age;
       this.salary = salary;
   }
  
   public Employee(String name,int age){
    this(name,age,0);
          
   }
  public Employee(String name){
      this(name,0);
  }
    
  public String toString(){
      return "name:"+name+":"+"Age:"+age;
  }
  
  public void viewTodoList(){
      for (int v :todoList){
          System.out.println(v);
      }
  }
  
  public static void viewKpi(){
      for (int kpi : kpis){
          System.out.println(kpi);
      }
  }
}
