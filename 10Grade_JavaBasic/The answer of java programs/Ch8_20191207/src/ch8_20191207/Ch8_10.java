/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;

/**
 *
 * @author xvpow
 */
public class Ch8_10 {
    //enum 能override只有toString
    //enum is Constructor must 必須是private
    
       enum Fruit{
        APPLE("蘋果"),
        KIWI("奇異果"),
        CHARRY("櫻桃");
        String name;
        private Fruit(String name){
            this.name = name;
        }
        public String toString(){
           // return "水果:"+super.toString();
            return "水果:"+name;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(Fruit.KIWI);
    }
    
}
