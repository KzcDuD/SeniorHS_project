/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;

class MyStyle implements PrintStyle{
      public void style(int value){
          System.out.println("value:"+value);
      }
}
public class Ch7_3 {
      
    
    public static void printValue(Iterator it,
            PrintStyle style){
        it.foreach(style);
    }
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(10);
        array.add(20);
        array.add(7);
        array.add(3);
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.size());
        MyStyle mys = new MyStyle();
        //printValue(array,mys);   
        //printValue(array,mys);
         Ch7_4.printValue(array, 
              new MyConsumer());
    }
    
}
