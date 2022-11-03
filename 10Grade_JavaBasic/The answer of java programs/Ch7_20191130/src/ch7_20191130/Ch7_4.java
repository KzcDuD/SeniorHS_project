/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;
import java.util.function.Consumer;
class MyConsumer implements Consumer<Integer> {
        public void accept(Integer v){
                System.out.println("Consumer:"+v);
        }
}
public class Ch7_4 {
  public static void printValue(Iterator it,
             Consumer<Integer> consumer ){
        it.foreach(consumer);
    }
    /*
    必考要背
    */
    public static void main(String[] args) {
        MyArray2 array2 = new MyArray2();
        array2.add(82);
        array2.add(93);
        array2.add(6);
        array2.add(1);
        MyConsumer myConsumer = new MyConsumer();
        printValue(array2,myConsumer);
        
        // Consumer<T>  void	accept(T t)
        //Function<T,R>  R	apply(T t)
        //Predicate <T> boolean	test(T t)
        // Supplier<T>  T  get()
        //UnaryOperator<T>  T	apply(T t) 
       
    }
    
}
