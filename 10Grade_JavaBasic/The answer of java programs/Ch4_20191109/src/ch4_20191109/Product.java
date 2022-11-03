/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109;
import javax.sound.midi.InvalidMidiDataException;
import java.io.IOException;
/**
 *
 * @author shihhaochiu
 */
public class Product {
    private String id;
    private int price;
    private String name;//長度必須小於10 大於3
    
    Product(){
           }
    //throws 可能發生的錯誤
    //throw 發生了某個錯誤
    public void setId(String id)throws InvalidMidiDataException,IOException{
        if (id == null) 
          throw new InvalidMidiDataException(); 
        else if(id.length() < 5)
            throw new IOException();
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setPrice(int price){
        
        if (price > 1000000 || price < 100){
            //System.out.println("錯誤的金額！");
            //IllegalArgumentException 無效的參數
            throw new 
          IllegalArgumentException("錯誤的金額！");
            //return;
        }
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    
    public void print(){
        System.out.println(this.getId()+":"+
                this.getPrice());
    }
    
    public void setName(String name) throws ProductNameNullException{
          if (name == null){
            throw new ProductNameNullException("Name不可為null");
 
        }
        if (name.length() < 3 || name.length() > 10 ){
            throw new ProductNameException("name的長度不正確");
        }
      
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
}
