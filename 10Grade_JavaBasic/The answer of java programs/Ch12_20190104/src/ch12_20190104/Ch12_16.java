/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author xvpow
 */
public class Ch12_16 {
    public static void main(String[] args) throws Exception{
	//序列化
	Student st1 = new Student("Ken",71);
	try(FileOutputStream fout = new FileOutputStream("C:\\MyDir\\student.obj");
	ObjectOutputStream objout = new ObjectOutputStream(fout);){
	    objout.writeObject(st1);
	}
	
	
    }
    
}
