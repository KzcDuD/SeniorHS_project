/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Ch11_6 {

    
    public static void main(String[] args) {
   ArrayList<String> list = new ArrayList<>();
   list.add("Ken");
   list.add("Vivin");
   list.add("Join");
   list.add("Lucy");
   list.add("Ben");
//      list.stream().peek(
//              (v)->System.out.println("peek:"+v)
//                ).
//              filter((s)->s.length() > 3).
//              forEach(System.out::println);
list.stream().peek((v)->System.out.println("peek:"+v)).
        forEach(System.out::println);
    }
    
}
