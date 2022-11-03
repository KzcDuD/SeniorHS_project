/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.util.HashMap;
import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Ch12_15 {

    public static void main(String[] args)throws Exception {
	String path = "C:\\MyDir\\employees.obj";
	try(FileInputStream fin = new FileInputStream(path);
	   ObjectInputStream objIn = new ObjectInputStream(fin);){
	    HashMap<String,ArrayList<Integer>> map = (HashMap)objIn.readObject();
	    System.out.println(map);
	}
    }
    
}
