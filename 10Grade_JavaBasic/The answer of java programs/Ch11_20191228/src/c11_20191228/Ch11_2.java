/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.stream.Stream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch11_2 {
 static int count = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Stream 特性
      //1 不可重複使用 同一Stream
      //2 Stream 不會改變來源
      //3 Stream 方法有兩種類型 Lazy 與 Terminal
      //Stream 類有哪些?
    //      Stream
    //      IntStream
    //      LongStream
    //      DoubleStream
    //Stream 產生方式
     // Stream 的方法 
    //Collcetion 的 stream() 方法 來產生
    
   //Stream<String>  s1 = Stream.of("A","B","C");
        //s1.forEach(System.out::println);
//    Stream<Integer>  s2 =    Stream.generate( 
//                ()->new java.util.Random().nextInt(90000)
//        );
//    s2.limit(10).forEach(System.out::println);
//Lambda 語法內使用的區域變數 必須是 常數(Constant)
   
//           Stream.generate(()->count++).limit(10).
//                   forEach(System.out::println);

    // Stream.iterate(1, (v)->v+1).limit(10).forEach(System.out::println);
    
    String[] names = {"Ken","Vivin","Lindy"};
    Stream.of(names).forEach(System.out::println);
 
    ArrayList<String> list = new ArrayList<>();
    list.add("Join");
    list.add("Ben");
    list.add("Lucy");
  Stream.of(list).forEach(System.out::println); 
    
    }
    
}
