/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109;
//所有建構子都預設呼叫default的父類建構子
public class RD extends Employee{
    private int pay;
    public RD(String name,String id,
            int age,int salary,int pay){
       super(name,id,age,salary);
       this.setPay(pay);
    }
    public void setPay(int pay){
        this.pay = pay;
    }
    
    public int getSalary(){
        return super.getSalary() + pay;
    }
  public void print(){
      System.out.print("Titile:RD:");
      super.print();
  }  
}
