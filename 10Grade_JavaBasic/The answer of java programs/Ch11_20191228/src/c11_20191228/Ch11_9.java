/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_9 {

   
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
 
   list.add("Vivin");
   list.add("Join");
   list.add("Ken");
   list.add("Ken");
   list.add("Ken");
   list.add("Lucy");
   list.add("Ben");
   //distinct() 過濾重複
   //list.stream().distinct().forEach(System.out::println);
  Optional<String> opt1 =  list.parallelStream().findAny();
  Optional<String> opt2 =  list.stream().findFirst();
  System.out.println(opt1.get());
    System.out.println(opt2.get());
    }
    
}
