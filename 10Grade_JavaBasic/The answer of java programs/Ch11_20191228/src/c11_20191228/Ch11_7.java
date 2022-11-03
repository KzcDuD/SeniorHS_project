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
public class Ch11_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
   list.add("Ken");
   list.add("Vivin");
   list.add("Join");
   list.add("Lucy");
   list.add("Ben");
   boolean b1 = list.stream().allMatch((n)->n.length() > 2);
   System.out.println(b1);
   boolean b2= list.stream().allMatch((n)->n.length() > 5);
    System.out.println(b2);
    
    boolean b3 = 
            list.stream().anyMatch((n)->n.length() > 3);
      System.out.println(b3);
       boolean b4 = 
            list.stream().anyMatch((n)->n.length() > 10);
      System.out.println(b4);   
      
       boolean b5 =   list.stream().noneMatch(n->n.length() > 10);
     System.out.println(b5);   
       boolean b6 =   list.stream().noneMatch(n->n.length() > 4);
       System.out.println(b6);   
    }
    
}
