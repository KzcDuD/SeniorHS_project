/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class Ch9_5 {

     static <T> void printLsit(List<T> list){
            System.out.println("=========================");
         list.forEach(System.out::println);
            System.out.println("=========================");
        }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(20);
       list.add(10);
       list.add(50);
       list.add(70);
       printLsit(list);             
       list.add(105);
       printLsit(list);
       list.add(5, 151);
       printLsit(list);
       ArrayList<Integer> tmp = new ArrayList<>();
       tmp.add(2100);
       tmp.add(6250);
       tmp.add(1256);
       list.addAll(tmp);
       printLsit(list);
      boolean b1 = list.contains(50);
      System.out.println("contains:"+b1);
      boolean b2 = list.contains(12);
      System.out.println("contains:"+b2);
      //找不到回傳-1
      int index = list.indexOf(70);
      System.out.println(index);
      list.add(10);
      list.add(20);
       printLsit(list);
      int index1 = list.indexOf(10);
      int index2 = list.lastIndexOf(10);
      System.out.printf("index1 :%d index2:%d%n",index1,index2);      
      list.remove(Integer.valueOf(1256));
      printLsit(list);
      
      list.removeIf(v->v < 30);
       printLsit(list);
     list.replaceAll(v->v+10); 
      printLsit(list);
     list.set(1, 25);
      printLsit(list);
      list.sort(Comparator.reverseOrder());
      printLsit(list);
      
    }
    
}
