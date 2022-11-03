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
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch12_7 {


    public static void main(String[] args) {
	File src = new File("C:\\MyDir\\test.zip");
	File target = new File("C:\\MyDir\\test_copy.zip");
    BufferedInputStream bfin = null;
    BufferedOutputStream bOut = null;
	try{
	    FileInputStream fin = new FileInputStream(src);
	    FileOutputStream fout = new FileOutputStream(target);
	     bfin = new BufferedInputStream(fin);
	     bOut = new BufferedOutputStream(fout);
	   int data =-1;
	   while ( (data = bfin.read()) != -1){
	       bOut.write(data);
	   }
	
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	      System.out.println(ex);
	}finally{
	    try{
		  bOut.close();
		 bfin.close();
	    }catch(Exception ex){
		
	    }
	     
	}
	
    }
    
}
