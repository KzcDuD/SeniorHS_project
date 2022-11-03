/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 *
 * @author xvpow
 */
public class Ch12_11 {

  
    public static void main(String[] args) {
//	String msg = "你好\nHoward\nKen";
//	File file = new File("C:\\MyDir\\write.txt");
//	try(FileWriter fw = new FileWriter(file);){
//	    fw.write(msg);
//	}catch(IOException ex){
//	    System.out.println(ex);
//	}
	File file2 = new File("C:\\MyDir\\write.txt");
	
	try (FileReader fr = new FileReader(file2);
		BufferedReader br = new BufferedReader(fr)){
//	    int data = -1;
//	    while ((data = fr.read())!= -1 ){
//		System.out.print((char)data);
//	    }

	String value = null;
	while((value = br.readLine()) != null){
	    System.out.println(value);
	}
	    
	}catch(Exception ex){
	    System.out.println(ex);
	}
	
    }
    
}
