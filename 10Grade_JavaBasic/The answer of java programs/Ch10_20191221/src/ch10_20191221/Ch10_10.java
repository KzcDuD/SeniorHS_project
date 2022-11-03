/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;

/**
 *
 * @author xvpow
 */
public class Ch10_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        MyList list = new MyList();
        
        list.add("Ken");
        list.add("Vivin");
        list.add("Join");
        list.foreach(System.out::println);
        
       MyList<Integer> list2 = new MyList<>();
       list2.add(20);
       list2.add(10);
       list2.add(5);
       list2.add(7);
       list2.foreach(System.out::println);
       
       
    }
    
}
