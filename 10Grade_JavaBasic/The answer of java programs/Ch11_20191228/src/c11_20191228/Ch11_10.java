/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;

/**
 *
 * @author xvpow
 */
public class Ch11_10 {

  
    public static void main(String[] args) {
      Teacher t1 = new Teacher();
      t1.setName("Vivin");
      //t1.getName().ifPresent(System.out::println);
    if (t1.getName().isPresent()){
        System.out.println(t1.getName().get().length());
    }else{
        System.out.println(0);
    }
      
//      if (t1.getName() != null){
//          System.out.println(t1.getName().length());
//      }else{
//          System.out.println(0);
//      }
      
    }
    
}
