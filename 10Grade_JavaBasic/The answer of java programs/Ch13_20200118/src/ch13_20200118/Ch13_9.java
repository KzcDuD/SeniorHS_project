/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class Ch13_9 {
//synchronized寫法1
    static class Test{
	int x;
	//Thread safety 執行續安全的++ 使用AtomicInteger
	AtomicInteger atomic = new AtomicInteger();
	public synchronized   void count(){
	    for (int i =1;i<=10;i++){
	    atomic.incrementAndGet();//++x
		//x++;
	    //atomic.getAndIncrement()//x++
		   System.out.println(atomic.get());
	    }
	}
    }
    
    //synchronized寫法2
       static class Test2{
	int x;
	public    void count(){
	    System.out.println("Thread Name:"+Thread.currentThread().getName());
	    synchronized(this){
		for (int i =1;i<=10;i++){
		       x++;
			System.out.println(x);
		   }
	    }
	}
    }
       
    //synchronized寫法3
       static class Test3{
	static final 
		ReentrantReadWriteLock  rwlock = new ReentrantReadWriteLock();    
	int x;
	public  void count(){
	    try{
		rwlock.writeLock().lock();
		//rwlock.readLock().lock();//只單純用readLock不會鎖 
		//必須配合使用writeLock
		for (int i =1;i<=10;i++){
		       x++;
			System.out.println(x);
		   }
	    }finally{
		rwlock.writeLock().unlock();
		//rwlock.readLock().unlock();
	    }

		
	}
    }   
       
    public static void main(String[] args) {
	  //synchronized寫法1 測試
//	Test test1 = new Test();
//	Thread th1 = new Thread(()->{
//	    test1.count();
//	});
//	Thread th2 = new Thread(()->{
//	    test1.count();
//	});
//	
//	th1.start();
//	th2.start();

  //synchronized寫法2 測試
//	Test2 test1 = new Test2();
//	Thread th1 = new Thread(()->{
//	    test1.count();
//	});
//	Thread th2 = new Thread(()->{
//	    test1.count();
//	});
//	
//	th1.start();
//	th2.start();


    //synchronized寫法3
    Test3 test1 = new Test3();
	Thread th1 = new Thread(()->{
	    test1.count();
	});
	Thread th2 = new Thread(()->{
	    test1.count();
	});
	
	th1.start();
	th2.start();
    
    }
    
}
