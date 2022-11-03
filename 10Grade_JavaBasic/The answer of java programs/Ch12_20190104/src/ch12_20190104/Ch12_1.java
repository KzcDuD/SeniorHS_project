/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.HashSet;
/**
 *
 * @author Dylan
 */
public class Ch12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Iris");
        list.add("Tom");
        list.add("Join");
//        list.stream().filter( n -> n.length() > 3).forEach(System.out::println);
        
//        List<String> list2 = list.stream().filter(n -> n.length() > 3).
//                    collect(Collectors.toList());
//        System.out.println(list.getClass().getName());

//        LinkedList list3 = list.stream().filter(n->n.length() > 3).
//                    collect(Collectors.toCollection(LinkedList::new));
//        System.out.println(list3);
        HashSet set = list.stream().filter(n->n.length() >3).
                collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);
        
    }
    
}
