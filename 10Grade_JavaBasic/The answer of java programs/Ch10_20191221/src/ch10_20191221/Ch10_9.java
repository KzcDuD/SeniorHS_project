/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;

import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch10_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Student st1 = new Student("Ken",100);
         Student st2 = new Student("Lindy",70);
         Student st3 = new Student("Iris",63);
         Student st4 = new Student("Vivin",92);
         Student st5 = new Student("Join",70);
         
        Comparator<Student> cmp = Comparator.
                  <Student,Integer>comparing(Student::getScore).
                  thenComparing(Student::getName);
         cmp = cmp.reversed();
         
        TreeMap<Student,String>  map = new TreeMap<>(cmp); 
        map.put(st1, "A");
        map.put(st2, "C");
        map.put(st3, "G");
        map.put(st4, "A");
        map.put(st5, "C");   
        System.out.println(map);
    }
    
}
