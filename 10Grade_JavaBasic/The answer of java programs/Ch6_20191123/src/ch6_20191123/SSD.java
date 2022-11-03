/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;

//類別實作USB implements
public class SSD implements USB {
    private String[] ssdData = null;
    public void input(String[] data){
        ssdData = data;
    }    
    public String[] output(){
        return ssdData;
    }
    
}
