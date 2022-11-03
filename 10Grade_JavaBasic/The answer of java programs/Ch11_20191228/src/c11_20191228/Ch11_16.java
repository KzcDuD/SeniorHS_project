/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(20);
       list.add(30);
       list.add(12);
       list.add(8);
       
//   Optional<Integer> optional = list.stream().reduce((n1,n2)->{
//       System.out.println(n1+":"+n2);
//        return n1 - n2;
//       });
//               
//   System.out.println("Sum:"+optional.get());

//Integer sum2 =  list.stream().reduce(2, (n1,n2)->{System.out.println(n1+":"+n2); 
//                                return n1+n2;});
//System.out.println(sum2);
 Integer sum3 = list.parallelStream().reduce(2, 
         (n1,n2)->{System.out.println("P1:"+n1+":"+n2);
        return n1+n2;}, 
         (n3,n4)->{
          System.out.println("P2:"+n3+":"+n4);return n3+n4;
         });
 System.out.println(sum3);
 //有排序 skip distinct 會改變原本 Stream 都不適合用parallelStream
    }
    
}
