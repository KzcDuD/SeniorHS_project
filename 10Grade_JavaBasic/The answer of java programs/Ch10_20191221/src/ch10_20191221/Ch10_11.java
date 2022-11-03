/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;

import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch10_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item<String,Float> i1 = 
               new Item("Title",5.62f);
       System.out.println(i1.getTitle()+":"
               +i1.getPrice());
    }
    
}
