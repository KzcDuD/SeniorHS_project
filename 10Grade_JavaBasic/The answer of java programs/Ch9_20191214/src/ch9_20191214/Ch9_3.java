/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch9_3 {

   
    public static void main(String[] args) {
       ArrayList value = new ArrayList();
        value.add(10);
        value.add(70);
        value.add("A");
        value.add(20);
        int sum = 0;
        for (int i =0; i < value.size();i++){
           Object obj =  value.get(i);
           //instanceof :obj 是否與右邊的類型在繼承樹上有關
           System.out.println(obj instanceof Number);
           //判斷obj是不是Integer這類別
            if (obj.getClass() == Integer.class){
                 Integer tmpV = (Integer)obj;
                 sum += tmpV;
           }
           
//           if (obj instanceof Integer){
//                 Integer tmpV = (Integer)obj;
//                 sum += tmpV;
//           }
         
        }
        System.out.println(sum);
        
    }
    
}
