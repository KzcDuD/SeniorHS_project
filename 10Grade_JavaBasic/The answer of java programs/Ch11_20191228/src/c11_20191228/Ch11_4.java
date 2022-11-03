/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.stream.Stream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //1 不可重複使用 同一Stream
//       Stream<String> s1 =   Stream.of("A","B","C");
//        s1.limit(2);
//        s1.forEach(System.out::println);
          //2 Stream 不會改變來源
     ArrayList<String> list = new ArrayList<>();
     list.add("Ken");
     list.add("Vivin");
      list.add("Lucy");
     list.stream().limit(2).forEach(System.out::println);
       System.out.println(list);
      //3 Stream 方法有兩種類型 Lazy 與 Terminal
    }
    
}
