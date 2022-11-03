/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;

/**
 *
 * @author xvpow
 */
public class Product implements Comparable<Product>{
    private int price;
    private String name;
    private static SortType storType = SortType.ASC ;
    public static void setSortType(SortType inStorType){
        storType = inStorType;
    }
    enum SortType{
        ASC(1),
        DESC(-1);
       private int type;
       private SortType(int type){
           this.type = type;
       }
      public int changeType(int cmp){
          return cmp * type;
      } 
    }
    public Product(int price,String name){
        this.price = price;
        this.name = name;
    }
    
    //回傳正數 目前物件大於傳入物件
    //回傳負數 目前物件小於傳入物件
    //回傳零 目前物件等於傳入物件
    public int compareTo(Product p){
        int cmp = name.compareTo(p.getName());
         if (price > p.price){
          cmp = 1;
         }else if(price < p.price){
           cmp = -1;
         }
         return storType.changeType(cmp);
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return name+":"+price;
    }
    //同一個物件 hashCode 必須相同 (不可使用亂數)
    //兩物件 equals 為真 hashCode 也必須 一樣
    //兩物件 hashCode 一樣 equals 不一定一樣
    
    public int hashCode(){
        System.out.println("hashCode:"+name+":"+(name.hashCode() + price));
       return name.hashCode() + price;
    }
    
    public boolean equals(Object obj){
        System.out.println("equals:"+name);
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Product tmp = (Product)obj;
        return this.getName().equals(tmp.getName()) && this.price == tmp.price;
    }
}
