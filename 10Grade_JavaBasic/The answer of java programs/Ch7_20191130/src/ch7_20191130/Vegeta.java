/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;
public class Vegeta implements SuperSkill {
    public void flying(float speed){
        if (speed - 10 > Fly.MAX_SPEED){
            throw new IllegalArgumentException("Speed over range!");
        }
        System.out.println("Vegeta speed:"+(speed-10));
    }
    
    public void jumping(float height){
           System.out.println("Vegeta height:"+(height-2));
    }
    
    public void attacking(int power){
        System.out.println("Vegeta power:"+(power-5));
    }
}
