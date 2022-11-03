/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.ArrayList;

public class Ch9_6 {

    public static void main(String[] args) {
       Product p1 = new Product(100,"A");
       Product p2 = new Product(70,"C");
       Product p3 = new Product(51,"D");
       Product p4 = new Product(94,"G");
      ArrayList<Product> list = new ArrayList<>();
       list.add(p1);
       list.add(p2); 
       list.add(p3);  
       list.add(p4);  
       
       list.forEach(System.out::println);
        //1  算出產品金額總和
        //2  幫我找到 金額:51 品名為D的 那筆index
        //3 幫我把所有的金額加10
        
//        int sum = 0;
//        for (Product p : list){
//            sum+= p.getPrice();    
//        }
//        System.out.println(sum);
//       
//        list.replaceAll(p->new Product(p.getPrice()+10,p.getName()));
//        System.out.println(list);
        
            //2  幫我找到 金額:51 品名為D的 那筆index
            
            Product find = new Product(51,"D");
            System.out.println(find.equals(p3));
            int index = list.indexOf(find);
            System.out.println(index);
            //先嘗試看看!!
            int sum = list.stream().mapToInt(Product::getPrice).sum();
            System.out.println(sum);
        
    }
    
}
