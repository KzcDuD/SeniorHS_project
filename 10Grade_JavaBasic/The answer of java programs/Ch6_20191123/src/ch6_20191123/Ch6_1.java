/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {
    public static void main(String[] args) {
       TestStatic st1 = new TestStatic();
       TestStatic st2 = new TestStatic();
       st1.value1 = "Ken";
       st2.value1 = "Vivin";
       System.out.println(st1.value1);
       System.out.println(st2.value1); 
        
       st1.value2 = "Iris";
       st2.value2 = "Join";
       TestStatic.value2 = "Ben";
       System.out.println(st1.value2);
       System.out.println(TestStatic.value2);    
       
       
    }
}
