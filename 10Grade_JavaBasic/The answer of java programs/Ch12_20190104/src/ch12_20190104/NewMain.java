/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 *
 * @author xvpow
 */
public class NewMain {

      static ArrayList<Integer> getData(int... values){
	ArrayList<Integer> list = 
		IntStream.of(values).collect(
			()-> new ArrayList<Integer>(),
			(ls,v)->ls.add(v), 
			(ls1,ls2)->ls1.addAll(ls2));
	
	    ArrayList<Integer> tmp = new ArrayList<>();
	   for (int v :values){
	       tmp.add(v);
	   }
	 return tmp;
    }
    public static void main(String[] args) {
	// TODO code application logic here
    }
    
}
