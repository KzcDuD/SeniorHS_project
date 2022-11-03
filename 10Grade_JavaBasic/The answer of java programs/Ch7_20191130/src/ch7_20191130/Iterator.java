/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;
import java.util.function.Consumer;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public interface Iterator {
    public boolean next();
    public int value();
    public void finish();
    public default void foreach(PrintStyle pStyle){
        while(next()){
            pStyle.style(value());
        }
         finish();
    }
    
        public default void foreach(
                Consumer<Integer> pStyle){
            foreach(pStyle,null);
    }
        
          public default void foreach(
                Consumer<Integer> pStyle,
                     Predicate<Integer> filter){
        while(next()){
            int v = value();
            if (filter == null || filter.test(v)){
               pStyle.accept(v);
            }          
        }
         finish();
    }  
}
