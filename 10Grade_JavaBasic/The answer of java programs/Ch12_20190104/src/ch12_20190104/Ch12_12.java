/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Ch12_12 {
    public static void main(String[] args) {
	//序列化
	String value ="Vivin,Ken";
	File f = new File("C:\\MyDir\\names.obj");
	try(FileOutputStream fout = new FileOutputStream(f);
	   ObjectOutputStream oout = new ObjectOutputStream(fout);){
	    oout.writeObject(value);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
    }
}
