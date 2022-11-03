/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */


class MySumFunction implements Function<MyArray,Integer> {
    public Integer apply(MyArray myArray){
        int sum = 0;
        for (int i =0;i <myArray.size();i++){
            sum += myArray.get(i);
        }
        return sum;
    }
}

class MyFilter implements Predicate<Integer>{
    private int gt;
    MyFilter(){
        
    }
    MyFilter(int gt){
        this.gt = gt;
    }
    public boolean test(Integer v){
            return v > gt;
    }
}

class MyReplaceAll implements UnaryOperator<Integer> {
    public Integer apply(Integer i){
        return i +10;
    }
}
class GenreatArrayList  implements Supplier<ArrayList<Integer>>{
    public ArrayList<Integer> get(){
        return new ArrayList<>();
    }
}
public class Ch7_5 {
     public static void  calculateMyArray(Function<MyArray,Integer> function,
             MyArray array){
         System.out.printf("計算結果:%d %n",function.apply(array));
     }
     
    public static void main(String[] args) {
         MyArray array = new MyArray();
        array.add(10);
        array.add(20);
        array.add(7);
        array.add(3);
//        MySumFunction mySf = new MySumFunction();
//        calculateMyArray(mySf,array);

      
    MyFilter filter = new MyFilter(5);
    array.foreach(new MyConsumer(), filter);
        
    array.replaceAll(new MyReplaceAll());
    List<Integer> list =  array.toList(new GenreatArrayList());
    list.forEach(System.out::println);
    
    }
    
}
