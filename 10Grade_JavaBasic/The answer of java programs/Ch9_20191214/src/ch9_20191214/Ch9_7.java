/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.LinkedList;
public class Ch9_7 {
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();
       list.add("Ken");
       list.add("Vivin");
       list.add("Join");
       list.add("Iris");
       Ch9_5.printLsit(list);
       list.offer("Test1");
       Ch9_5.printLsit(list);
     String v2 = list.poll();//取第一個數值 會刪除List內容
     System.out.println("poll:"+v2);
     Ch9_5.printLsit(list);
    String v3= list.peek();  //取第一個數值 不會刪除List內容
      System.out.println("peek:"+v3);
       Ch9_5.printLsit(list);
    }
    
}
