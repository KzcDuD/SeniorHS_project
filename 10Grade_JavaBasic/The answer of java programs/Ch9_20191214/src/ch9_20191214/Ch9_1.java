/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

 
    public static void main(String[] args) {
    
        PhoneInfo p = new PhoneInfo();
        System.out.println(p.getHeight());
        System.out.println(p.getWidth());
        PhoneInfo.PhoneInfoDetail pd =  p.getDetail();
        System.out.println(pd.getCompany());
        System.out.println(pd.getVersion());
    }
    
}
