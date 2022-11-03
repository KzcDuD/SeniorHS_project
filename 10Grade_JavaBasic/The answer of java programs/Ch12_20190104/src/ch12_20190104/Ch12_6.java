/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch12_6 {

    public static void main(String[] args) {
	File src = new File("C:\\MyDir\\myFile.txt");
	File target = new File("C:\\MyDir\\myFile_copy.txt");
	try{
	   FileInputStream fin = new FileInputStream(src); 
	   FileOutputStream fout = new FileOutputStream(target);
	   int data = -1;
	   while ( (data = fin.read()) != -1){
		//System.out.println(data);
		fout.write(data);
	   }
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
