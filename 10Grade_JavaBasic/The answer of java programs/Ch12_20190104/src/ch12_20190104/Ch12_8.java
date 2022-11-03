/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch12_8 {
    public static void main(String[] args) {
	 File src = new File("C:\\MyDir\\test.zip");
	File target = new File("C:\\MyDir\\test_copy.zip");
	try( FileInputStream fin = new FileInputStream(src);
	     FileOutputStream fout = new FileOutputStream(target);){
	     int index =-1;
	     byte[] buffer = new byte[1023];
	     while ( (index = fin.read(buffer)) != -1){
		 fout.write(buffer, 0, index);
	     }
	}catch(IOException ex){
	    System.out.println(ex);
	}
    }
}
