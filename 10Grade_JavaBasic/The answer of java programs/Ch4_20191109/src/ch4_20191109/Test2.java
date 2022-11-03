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
public class Test2 extends Test1 {
    Test2(int value1,String str2,int value3){
      this(); 
      System.out.printf("Test2 value1:%d str2:%s value3:%d %n",
              value1,str2,value3);
    }
    Test2(){
        super(10,"Test2 Call");
    }  
    
}
