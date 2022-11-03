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
public class Test1 {
    Test1(){
      System.out.printf("Test1() %n");   
    }
      Test1(int value1,String value2){
        this();
        System.out.printf("Test1 v1:%d v2:%s %n",
                value1,value2);
    }
}
