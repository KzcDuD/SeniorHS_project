/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //非基本型態的比較用equals
        String[] names = {new String("Lindy"),
                        new String("Vivin"),
                        new String("Ken")};
     int index = -1;
      String name= "Ken";     
      for (int i =0;i<names.length;i++){
          if (name.equals(names[i]) ){
             index = i; 
          }
      }
      System.out.println(index);
     
    }
    
}
