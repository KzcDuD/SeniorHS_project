/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author Dylan
 */
public class Ch12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Join");
        list.add("Tom");
        list.add("Iris");

//Map<Boolean,List<String>>  map = 
//	list.stream().collect(Collectors.partitioningBy(n->n.length() > 3));
//System.out.println(map);
        Map<String, List<String>> group = list.stream().
                collect(Collectors.
                        groupingBy(n -> n.substring(n.length() - 1)));
        System.out.println(group);

// Map<String,Long> group2=   list.stream().
//	collect(Collectors.
//		groupingBy(
//			n->n.substring(n.length()-1),
//		Collectors.mapping(v->{
//			System.out.println(v);
//			return v;
//		    }, Collectors.counting())	));
// System.out.println(group2);
        Map<String, Integer> group3 = list.stream().
                collect(Collectors.
                        groupingBy(
                                n -> n.substring(n.length() - 1),
                                Collectors.mapping(v -> {
                                    System.out.println(v);
                                    return v;
                                }, Collectors.summingInt(v -> v.length()))));
        System.out.println(group3);
    }

}
