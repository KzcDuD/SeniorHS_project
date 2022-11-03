/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Dylan
 */
public class Ch12_3 {

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
	
	//請幫我轉成Map K = 整數 長度  v 字串
	Map <Integer,String> map = list.stream().
		collect(Collectors.toMap(n->n.length(), n->n,
			(n1,n2)->n1+","+n2));
        System.out.println(map);
        
    }
    
}
