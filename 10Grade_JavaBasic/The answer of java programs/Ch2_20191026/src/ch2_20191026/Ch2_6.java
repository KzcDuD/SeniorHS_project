/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20191026;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {
    /*
     1 回傳值 如果無回傳要填入void 
     2 方法名稱 
     3 傳入參數 無參數()
     4 方法本體{ }
    
    */
    //static 只能呼叫 static的
    
    static void test1(){
        System.out.println("Hello!!");
    }
    static int sum(int a,int b){
        int ans = a +b;
        //return 含意
        // 回傳數值
        // 離開方法
        return ans;
    }
    
    static int power(int n,int pow){
        int ans = 1;
        for (int i = 1;i <= pow;i++){
            ans *= n;
        }
        return ans;
    }
    public static void main(String[] args) {
       
         test1();
        System.out.println(sum(2,5));
        
        System.out.println(power(2,3));//8
        System.out.println(power(2,4));//16
            
                
    }
    
}
