/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;

/**
 *
 * @author xvpow
 */
public class TestSingleton {
    //Singleton 特性
    //一定有一組私有的建構子
    //一定有一組static的變數去存放物件
    //一定有一組static的方法去創造物件
    private String name;
    private static TestSingleton object;
    private TestSingleton(){
    }
    public static TestSingleton
	 createTestSingleton(String name){
	if (object == null){
	    object = new TestSingleton();
	}
	object.name = name;
	return object;
    }  
    public String toString(){
	return name;
    }
}
