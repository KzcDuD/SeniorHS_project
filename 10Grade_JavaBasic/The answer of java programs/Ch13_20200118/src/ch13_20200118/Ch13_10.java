/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author xvpow
 */
public class Ch13_10 {

   
    public static void main(String[] args) {
	    //CachedThreadPool 可重複使用執行續
//       ExecutorService es = Executors.newCachedThreadPool();
//       for (int i =0; i<=20;i++){
//	          es.submit(()->{
//		System.out.println("Test:"+Thread.currentThread().getName());
//	     });
//       }
         ExecutorService es = Executors.newFixedThreadPool(5);
       for (int i =1; i<=20;i++){
	          es.submit(()->{
		System.out.println("Test:"+Thread.currentThread().getName());
		try{Thread.sleep(2000);}catch(InterruptedException ie){}
	     });
       }
       //等ExecutorService 全部的工作完成後停止
      // es.shutdown();
       //等ExecutorService 不管工作是否都已經進入ExecutorService或完成
       //會回傳還沒進入ExecutorService的工作
          List<Runnable> list = es.shutdownNow();
	  System.out.println("list Size:"+list.size());
    }
    
}
