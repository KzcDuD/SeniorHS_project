/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author xvpow
 */
public class Ch13_12 {
    //Test ForkJoin
    	static class FindMaxTask extends RecursiveTask<Integer>{
	    //分解到多小的顆粒
	   private final int threshold;
	   private final int[] data;
	   private int begin;
	   private int end;
		   
	public FindMaxTask(int[] data, int begin,int end,int threshold){
	    this.threshold = threshold;
	    this.data = data;
	    this.begin = begin;
	}	   
	
	@Override
	protected Integer compute() {
	    
	    if (end -begin < threshold ){
		//開始做工作
		int max = Integer.MIN_VALUE;
		for (int i = begin; i<= end;i++){
		    int n = data[i];
		    if (n > max){
			max = n;
		    }
		}
		return max;
		
	    }else{
		//分解
		int mid = (end - begin)/2 + begin;
		FindMaxTask a1 = new FindMaxTask(data,begin,mid,
						threshold);
		a1.fork();//丟到適當的執行序內
		FindMaxTask a2 = new FindMaxTask(data,mid +1,end,
						threshold);
		//join() 會等待其他fork的Task完成
		 return Math.max(a2.compute(),a1.join());
	    }
	   
	}
	    
	}
	
    public static void main(String[] args) {
	
	int[] bigData = new int[1024*1024 * 256];
	java.util.Random ran = new java.util.Random();
	for (int i =0;i< bigData.length;i++){
	    bigData[i]= ran.nextInt();
	}
	//bigData.length/16 越小 顆粒就越細
	FindMaxTask task = new FindMaxTask(bigData,0,bigData.length - 1,
	bigData.length/16 );
	ForkJoinPool pool = new ForkJoinPool();
	
	Date begin = new Date();
	Integer max= pool.invoke(task);
	System.out.println("Max:"+max);
	Date end = new Date();
	long t =  end.getTime() - begin.getTime();
	System.out.println(t);
	
    }
    
}
