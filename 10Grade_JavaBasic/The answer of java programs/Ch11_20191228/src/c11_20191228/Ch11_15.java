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
public class Ch11_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Teacher> list = new ArrayList<>();
     Teacher t1 = new Teacher();
     t1.addBook("MyBook4");
      Teacher t2 = new Teacher();
     t2.addBook("MyBook4");
     t2.addBook("MyBook5");
     list.add(t1);
     list.add(t2);
     //flatMap 方法 必須回傳 某種Stream
     //他幫我們解開Stream的內容
    long count =   list.stream().flatMap(t->t.getBookStream()).count();
    System.out.println(count);
     int sum=  
             list.stream().flatMapToInt(t->t.getBookStream().
                     mapToInt(n->n.length())).sum();
     System.out.println(sum);
    
    }
    
}
