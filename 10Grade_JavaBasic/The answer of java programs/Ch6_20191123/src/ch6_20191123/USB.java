/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;
public interface USB {
    //介面一般方法都是抽象的
    //預設的方法如下 public abstract void intput(String[] data);
     void input(String[] data);
     String[] output();
    
}
