/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Ch12_9 {
	static class MyClose implements AutoCloseable{
	    String name;
	    MyClose(String name){
		this.name = name;
	    }
	    @Override
	    public void close() throws Exception {
		    System.out.println("close name:"+name);
		    if (name.equals("Close1")){
			throw new Exception(name+" Exception!");
		    }
	    } 
	}
    public static void main(String[] args) {
	//關閉順序為倒敘
	try(MyClose myClose1 = new MyClose("Close1");
	    MyClose myClose2 = new MyClose("Close2");){
	    System.out.println("Body......");
	    throw new Exception("Body exception!!!");
	    //只有第一個發生的例外會直接被catch 其他都Suppressed
	}catch(Exception ex){
	Throwable[] thArray =  ex.getSuppressed();
	    System.out.println(ex);
	Stream.of(thArray).forEach(System.out::println);
	}finally{
	    System.out.println("finally......");
	}
	
	
    }
    
}
