/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;
public class Ch13_1 {
    public static void main(String[] args) {
	
	TestSingleton ts1 = 
	TestSingleton.createTestSingleton("Ken");
	System.out.println(ts1);
	TestSingleton ts2  = 
	TestSingleton.
		createTestSingleton("Howard");
	 System.out.println(ts2);

	System.out.println(ts1 == ts2);
	System.out.println(ts1.hashCode());
	System.out.println(ts2.hashCode());
    }
    
}
