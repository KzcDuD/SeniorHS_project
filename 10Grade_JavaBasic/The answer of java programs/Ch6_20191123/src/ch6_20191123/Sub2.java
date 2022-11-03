/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;

/**
 *
 * @author xvpow
 */
public class Sub2 extends Parnet2 {
    public int value1;
        
    public static void test(){
        System.out.println("Sub2:...");
    }
    public void setValue1(int v1){
        this.value1 = v1;
    }
    
    public String toString(){
        return value1+"";
    }
    
}
