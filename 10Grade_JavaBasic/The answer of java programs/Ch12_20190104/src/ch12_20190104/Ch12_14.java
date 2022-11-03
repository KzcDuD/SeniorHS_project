/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.util.HashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Ch12_14 {

    
    static ArrayList<Integer> getData(int... values){
//	ArrayList<Integer> list = 
//		IntStream.of(values).collect(
//			()-> new ArrayList<Integer>(),
//			(ls,v)->ls.add(v), 
//			(ls1,ls2)->ls1.addAll(ls2));
	
	    ArrayList<Integer> tmp = new ArrayList<>();
	   for (int v :values){
	       tmp.add(v);
	   }
	 return tmp;
    }
    
    public static void main(String[] args)throws Exception {
	HashMap<String,ArrayList<Integer>> map = new HashMap<>();
	map.put("Vivin", getData(72,86,93));
	map.put("Join", getData(52,81,91,100));
	map.put("Iris", getData(62,100,72));
	try(FileOutputStream fout = new FileOutputStream("C:\\MyDir\\employees.obj");
		ObjectOutputStream objout = new ObjectOutputStream(fout);){
	    objout.writeObject(map);
	}
	
	
    }
    
}
