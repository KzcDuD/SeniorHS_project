/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch11_13 {

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
      long count =   list.stream().count();
      System.out.println(count);
     list.stream().skip(2).forEach(System.out::println);
     Comparator<String> cmp =  Comparator.<String,String>comparing(s->s);
       Optional<String> max = list.stream().max(cmp);
       Optional<String> min = list.stream().min(cmp);
       max.ifPresent(System.out::println);
       min.ifPresent(System.out::println);
   
    }
    
}
