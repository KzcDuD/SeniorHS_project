/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;

import java.util.LinkedList;

/**
 *
 * @author xvpow
 */
public class Ch9_9 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
       list.add("Ken");
       list.add("Vivin");
       list.add("Join");
       list.add("Iris");
        String value = null;
//        while( (value = list.poll()) != null ){
//            System.out.println(value);
//        } 
        
        for (;list.size() > 0;){
           System.out.println(list.poll());  
        }
               
        System.out.println(list.size());
                    
        
        
    }
    
}
