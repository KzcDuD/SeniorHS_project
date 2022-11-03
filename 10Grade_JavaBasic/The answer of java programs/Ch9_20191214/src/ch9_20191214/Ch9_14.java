/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.TreeSet;
public class Ch9_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Product.setSortType(Product.SortType.ASC);
       Product p1 = new Product(100,"A");
       Product p2 = new Product(70,"A");
       Product p3 = new Product(51,"D");
       Product p4 = new Product(94,"G");
       Product p5 = new Product(94,"H");
       TreeSet<Product> set = new TreeSet<>();
       set.add(p1);
       set.add(p2);
       set.add(p3);
       set.add(p4);
       set.add(p5);
       set.forEach(System.out::println);
    }
    
}
