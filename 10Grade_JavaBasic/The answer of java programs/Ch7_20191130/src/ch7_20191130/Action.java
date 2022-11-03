/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;
@FunctionalInterface
public interface Action {
    //只要interface 抽象的方法 
    //只有一組時可稱為FunctionalInterface
    public boolean doing();
    //可以開始有實體方法
    //實體方法 分為靜態與預設(default)
    
    public default String isPass(String pass,
                              String faill,
                              boolean faillThrowException){
                 if (doing()){
                     return pass;
                 }else{
                     if (faillThrowException)
                      throw new RuntimeException(faill);
                     return faill;
                 }
    }
    
    
}
