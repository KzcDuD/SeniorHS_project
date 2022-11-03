/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_12 {

        static void test1( ArrayList<Test1> list ){
            System.out.println("test1....");      
        }
        //限定傳入參數的泛型是某類的子類型
           static void test2( ArrayList<? extends Test2> list ){
            System.out.println("test2....");      
        }
        
    public static void main(String[] args) {
        Object obj = new String();
        //泛型無支持多型
      //ArrayList<Object> list = new ArrayList<>();
      
      ArrayList<Test1> myList1 = new  ArrayList<Test1>();
      test1(myList1);
      ArrayList<Test2> myList2 = new  ArrayList<Test2>();
      //test1(myList2);//只能傳遞一模一樣的泛型類或沒有泛型的
      ArrayList myList3 = new  ArrayList();
      test1(myList3);//只能傳遞一模一樣的泛型類或沒有泛型的
      
      ArrayList<Test3> myList4 = new  ArrayList<>();
      test2(myList4);
       ArrayList<Test1> myList5 = new  ArrayList<>();
     // test2(myList5);  
    }
    
}
