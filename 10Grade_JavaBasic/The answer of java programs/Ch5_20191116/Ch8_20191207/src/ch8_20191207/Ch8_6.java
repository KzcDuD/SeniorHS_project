/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;
public class Ch8_6 {
    
    static ArrayList<String> arrayToList(
            Function<String[],ArrayList<String>> f,
            Predicate<String> p,
            String ... values){
          String[] strArray = new  String[values.length];
          int i = -1;
           for (String s : values){
               if (p.test(s)){
                   strArray[++i] = s;
               }
           }
           
           String[] finalAray = new String[i +1];
           for (int k = 0;k <=i ;k++){
               finalAray[k] = strArray[k];
           }
           
        return f.apply(finalAray) ;
    }
   private static ArrayList<String> arrayToList(String[] array){
           ArrayList<String> list = new ArrayList<>();
                for (String s :array){
                    list.add(s);
                }
         return list;       
    }
   
   private static boolean myFilter(String st){
       return st.length() > 2 && st.endsWith("n");
   }
   
   
    //Method Reference
    public static void main(String[] args) {
         ArrayList<String> newList= arrayToList(Ch8_6::arrayToList,
                 Ch8_6::myFilter,
                "Ken","Vivin","Lindy","Join","Iris");
         System.out.println(newList);
        
        
//         ArrayList<String> newList= arrayToList((sArray)->{
//            ArrayList<String> list = new ArrayList<>();
//                for (String s :sArray){
//                    list.add(s);
//                }
//            return list;},
//                (s)->s.length() > 2 && s.endsWith("n"),
//                "Ken","Vivin","Lindy","Join","Iris");
//         System.out.println(newList);
    }
    
}
