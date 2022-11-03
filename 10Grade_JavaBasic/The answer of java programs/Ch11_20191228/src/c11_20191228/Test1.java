/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Test1 {
   
    
    //方法泛型
    public <R> R testSupplier(Supplier<R> sp ){
        return sp.get();
    }
}
