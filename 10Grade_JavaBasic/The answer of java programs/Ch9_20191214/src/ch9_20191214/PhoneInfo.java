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
public class PhoneInfo {
    private float height;
    private float width;
    private int version;
    private String company;
    
    public PhoneInfo(){
        height = 1920;
        width = 1080;
        version = 28;
        company = "Sony";
    }
   
    public PhoneInfoDetail getDetail(){
        return new PhoneInfoDetail();
    }
    
    public  class PhoneInfoDetail{
        private int version;
        private String company;
       private PhoneInfoDetail(){
            this.version = PhoneInfo.this.version;
            this.company = PhoneInfo.this.company;
        }
        
        public int getVersion(){
            return version;
        }
        public String getCompany(){
            return company;
        }
    }
    
    public float getHeight(){
        return this.height;
    }
    public float getWidth(){
        return this.width;
    }
    
}
