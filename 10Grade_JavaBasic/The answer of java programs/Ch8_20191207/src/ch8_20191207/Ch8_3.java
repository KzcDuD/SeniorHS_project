/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;
import java.util.function.Predicate;
public class Ch8_3 {
    
     static class MyFilter implements Predicate<Integer>{
         private int cmpCondition;
         public MyFilter(){
             
         }
         public MyFilter(int condtion){
             cmpCondition = condtion;
         }
         public boolean test(Integer v){
             return v >cmpCondition;
         }
     }
    static void testl(Predicate<Integer> filter,int...values){
        for(int v : values){
             if (filter.test(v)){
                    System.out.println(v);
             }
        }
       
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        //所有大於10的數字就顯示
        
        //MyFilter mf = new MyFilter(5);
       // testl(mf,91,72,83,6,9,11);
        //匿名內部類 1
//        testl(new Predicate<Integer>(){
//            public boolean test(Integer v){
//                return v < 10;
//            }
//        },91,72,83,6,9,11);
      //匿名內部類 2
      Predicate<Integer> p =  new Predicate<Integer>(){
            public boolean test(Integer v){
                return v >20;
            }
        };
      // testl(p,8,25,31,15,34);
      //lambda 
      testl(i->i>20,8,25,31,15,34);
      
       
    }
    
}
