/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;
import java.util.function.Function;
public class Ch8_11 {
    
    static Integer[] strTointArray(Function<String[],Integer[]> f,
                            String[] names){
                 return f.apply(names);
        }
     static Integer[] strToLenArray(String[] names){
            Integer[] length = new Integer[names.length];
                 for (int i= 0; i<names.length ;i++){
                     length[i] = names[i].length();
                 }
            return length;
    }
    
    public static void main(String[] args) {
       String[] values = {"Ken","Vivin","Lindy","Join"};
       Integer[] lenArray =  strTointArray(Ch8_11::strToLenArray,values);
       
       for (int len : lenArray){
           System.out.println(len);
       }
           
        
    }
    
}
