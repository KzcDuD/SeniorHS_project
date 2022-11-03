/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116;

/**
 *
 * @author xvpow
 */
public class Fruit {
     private String name;
    private int price;
 
    
    public Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String toString(){
        String msg = name+":"+price;
        return msg;
    }
    @Override
    public boolean equals(Object cmpObj){
        if (cmpObj  == null || !(cmpObj instanceof Fruit)  ){
            return false;
        }
        Fruit tmp = (Fruit)cmpObj;
        return this.name.equals(tmp.name) && this.price == tmp.price;
    }
}
