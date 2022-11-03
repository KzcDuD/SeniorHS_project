/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch10_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Student st1 = new Student("Ken",100);
         Student st2 = new Student("Lindy",70);
         Student st3 = new Student("Lindy",70);
        HashMap<Student,Integer> map 
                = new HashMap<Student,Integer>();
        map.put(st1, 96);
        map.put(st2, 15);
        map.put(st3, 20);
          
        System.out.println(map);
    }
   
}
