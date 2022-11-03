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
public class Ch11_8 {

  
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
 
   list.add("Vivin");
   list.add("Join");
   list.add("Ken");
   list.add("Lucy");
   list.add("Ben");
   
  // list.stream().peek(System.out::println).allMatch(s->s.length() > 2);
  
  //allMatch 只要其中之一的條件不成立就停止
  // list.stream().peek(System.out::println).allMatch(s->s.length() > 3);
  //anyMatch 只要其中之一的條件成立就停止 回傳 true
  // list.stream().peek(System.out::println).anyMatch(s->s.length()<4);
    //noneMatch 只要其中之一的條件成立就停止 回傳 false
    list.stream().peek(System.out::println).noneMatch(s->s.length()<4);
    }
    
}
