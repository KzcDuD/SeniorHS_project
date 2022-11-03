/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;
public class Ch1_2 {

    public static void main(String[] args) {
        //Java變數分兩大類
        //1 基本型態
        //byte short int long  float double char boolean
        //2 非基本型態(參考類型)
        
        
         //必考
         //char 0~65535 
         // byte  -128~127
         //byte short int char String enum
       
        int action = 3;        
        switch(action){
          case 1:
                System.out.println("A");
                break;
          case 2:
               System.out.println("B");
              break;
          default:
               System.out.println("C");
              break;
        }
        
         switch(action){
            default:
               System.out.println("C");     
            case 1:
                System.out.println("A");
                break;
          case 2:
               System.out.println("B");
              break;
       
        }                  
          //1 A
        //2 B
        //3 Null
        //4 以上皆非
        String s1 = null;        
        switch(s1){
            case "":
                System.out.println("A");
                break;
            case " ":
                System.out.println("B");
               break;
            default:
               System.out.println("Null");
                break;
        }
        
        
    }
    
}
