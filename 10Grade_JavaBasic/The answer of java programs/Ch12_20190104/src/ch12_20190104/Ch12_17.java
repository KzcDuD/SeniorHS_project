/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch12_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
	//反序列化
	String path = "C:\\MyDir\\student.obj";
	try(FileInputStream fin = new FileInputStream(path);
	   ObjectInputStream objIn = new ObjectInputStream(fin);){
	   Student st = (Student)objIn.readObject();
	    System.out.println(st);
	}
    }
    
}
