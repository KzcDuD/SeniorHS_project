/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch11_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();

        list.add("Vivin");
        list.add("Join");
        list.add("Ken");
        list.add("Lucy");
        list.add("Ben");
        //map 轉換 
      // list.stream().map(s->s.length()).forEach(System.out::println);
      // list.stream().map(s->"Name:"+s).forEach(System.out::println);
       // list.stream().map(String::toUpperCase).forEach(System.out::println);
        int sum = list.stream().mapToInt(String::length).sum();
        System.out.println(sum);
        
        
    }
    
}
