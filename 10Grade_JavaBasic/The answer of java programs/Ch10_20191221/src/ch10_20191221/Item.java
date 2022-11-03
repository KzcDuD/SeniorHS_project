/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;

/**
 *
 * @author xvpow
 */
public class Item<E1 extends CharSequence,E2 extends Number> {
    private E1 titile;
    private E2 price;
    public Item(E1 e1,E2 e2){
        
        this.titile = e1;
        this.price = e2;
    }
    
    public E1 getTitle(){
        return this.titile;
    }
    
    public E2 getPrice(){
        return this.price;
    }
    
}
