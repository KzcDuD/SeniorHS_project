/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
/**
 *
 * @author Dylan
 */
public class Ch12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList();
        list.add(68);
        list.add(72);
        list.add(81);
        list.add(76);
        
//        Map<Integer,String> map = list.stream().collect(Collectors.toMap(k->k,
//                v->{
//                   char c = (char)v.intValue();
//                return  Character.toString(c);
//                }));
//        System.out.println(map);
        list.stream().mapToInt(v->v).collect(null, null, null);
        
    }
    
}
