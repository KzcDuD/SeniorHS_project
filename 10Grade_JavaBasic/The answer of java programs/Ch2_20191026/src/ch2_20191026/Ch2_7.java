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
public class Ch2_7 {
    static int step1(){
        System.out.println("Step1");
        return 2;
    }
    static boolean step2(){
        System.out.println("Step2");
        return true;
    }
    static void step3(){
        System.out.println("Step3");        
    }
    
    static void step4(int value){
        System.out.println("value:"+value);        
        System.out.println("Step4");        
    }    
    public static void main(String[] args) {
      
        for (int i = step1();i<=3 && step2() ;i++,step3()){
            step4(i);
        }
        
        
        
    }
    
}
