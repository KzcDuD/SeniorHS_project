/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;

/**
 *
 * @author xvpow
 */
public class SDCard implements USB{
    private String[] data;
    public void input(String[] data){
        this.data = data;
    }
    
    public void updatData(int index,String data){
        
    }
    public String[] output(){
        String[] newData = new String[data.length];
        for (int i =0; i <newData.length;i++){
            newData[i] ="SDCard:"+data[i] ;
        }
        return newData;
    }
    
}
