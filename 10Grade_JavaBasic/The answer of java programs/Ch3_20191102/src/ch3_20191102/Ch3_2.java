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
public class Ch3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        類別
           
//        物件
         Toy toy1= new Toy();
         toy1.setName = (null);
         //price 50 ~30000
        toy1.setPrice (100);
        toy1.material = "PVC";
        toy1.print();
        
        Toy toy2 = new Toy();
        toy2.setName = "jason";
        toy2.setPrice(5200);
        toy2.material ="合金";    
//        System.out.println(toy2.name +":"+toy2.price+":"+toy2.material);
        toy2.print();
        
    }
    
}
