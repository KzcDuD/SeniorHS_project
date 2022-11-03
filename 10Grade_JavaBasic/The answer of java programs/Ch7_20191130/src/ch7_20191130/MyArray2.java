/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;


public class MyArray2 implements Iterator {
     public static int MAX_LENGTH = 50000;
    private int[] base = new int[MAX_LENGTH];
    private int myArrayIndex = -1;
    private int nextIndex = 0;
    public void add(int value){
        base[++myArrayIndex] = value;        
    }
    public int length(){
        return myArrayIndex +1;
    }
    public int poll(int index){
        if (index > myArrayIndex || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return base[index];
    }
       public boolean next(){
           if (length() > nextIndex ){
               return true;
           }
           return false;
       }
    public int value(){
        return this.poll(nextIndex++);
    }
    public void finish(){
        nextIndex = 0;
    }
    
}
