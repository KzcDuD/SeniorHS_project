/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;
public class SonGoku implements SuperSkill {
    public void flying(float speed){
        if (speed + 100 > Fly.MAX_SPEED){
            throw new IllegalArgumentException("Speed over range!");
        }
        System.out.println("SonGoku speed:"+(speed + 100));
    }
    
    public void jumping(float height){
           System.out.println("SonGoku height:"+(height + 10));
    }
    
    public void attacking(int power){
        System.out.println("SonGoku power:"+(power + 100));
    }
}
