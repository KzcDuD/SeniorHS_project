/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class Ch12_13 {

    public static void main(String[] args) {
	//反序列化
	File f = new File("C:\\MyDir\\names.obj");
	try(FileInputStream fIn = new FileInputStream(f);
	   ObjectInputStream objIn = new ObjectInputStream(fIn);	){
	   String names = (String) objIn.readObject();
	   System.out.println(names);
	}catch(IOException | ClassNotFoundException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
