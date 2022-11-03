/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author xvpow
 */
public class Ch13_11 {
    public static void main(String[] args) throws Exception {
	 ExecutorService es = Executors.newFixedThreadPool(5);
	 //Future 是執行序工作完成後的通知器
	 //會回傳完成後的資訊
	Future<Integer>  genNumber = 
		es.submit(()->{
		    Thread.sleep(2000);
		    return new java.util.Random().nextInt(50);
		});
	System.out.println("Step 1");
	Thread t1 = new Thread(()->{
	try{Integer v = genNumber.get();
	    System.out.println("Value:"+v);
	}catch(Exception ex){}
	});
	t1.start();
	System.out.println("Step 2");
	 es.shutdown();
    }
    
}
