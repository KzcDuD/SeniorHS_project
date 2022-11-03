/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20191102;

/**
 *
 * @author student
 */
public class Toy {
    //屬性 Attributes
    private String name;
    //封裝 Encapsulation
    private int price;
    String material;
    String setName;
    
    Toy(){
        
    }
    
    Toy(String name,int price,String material){
        System.out.println(" Toy(name price material)");
        this.name = name;
        this.price = price;
        this.material = material;
    }
    
    public void setPrice(int myPrice){
        if( myPrice < 50 && myPrice > 30000){
           System.out.println("Error!!");
            return;
        }
        
       price = myPrice;
}    
     
     
    public int getPrice(){
        return price;
    }

    public void setName(String myName){
         if(myName == null|| myName.length() < 0 || myName.length() > 50 ){
             System.out.println("Error name length!! ");
                       return;
         }
        name = myName;
}
         public String getName(){
             return name;
         }
    void print(){
        System.out.println(name+":"+price+":"+material);

}   
}
