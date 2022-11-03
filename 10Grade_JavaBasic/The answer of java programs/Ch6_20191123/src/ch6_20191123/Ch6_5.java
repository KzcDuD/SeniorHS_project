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
public class Ch6_5 {
    //遮蔽 Shading    
    //所有屬性與靜態方法    
    //遮蔽 看類別 複寫 看物件
    public static void main(String[] args) {
      
        Parnet p1 = new Sub();
        p1.value1 = 95;
        System.out.println(p1);
        
       Sub p2 = new Sub();
       p2.value1 = 71; 
       System.out.println(p2);
    }
    
}
