/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch11_5 {

 
    public static void main(String[] args) {
      
        Teacher t1 = new Teacher();
        t1.addBook("MyBook1");
       // t1.getBook().forEach(System.out::println);
//      List<String> bookList = t1.getBook();
//      bookList.add("B1");
//      bookList.add("B2");
//      bookList.add("B3");
   //   t1.getBook().forEach(System.out::println);
    t1.getBookStream().forEach(System.out::println);
    }
    
}
