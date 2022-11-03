/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList<T> baseList = new ArrayList<>();
    public void add(T v){
        
        baseList.add(v);
    }
    
    public T get(int index){
        return baseList.get(index);
    }
    
    public void foreach(Consumer<T> cm){
        baseList.forEach(cm);
    }
            
    
}
