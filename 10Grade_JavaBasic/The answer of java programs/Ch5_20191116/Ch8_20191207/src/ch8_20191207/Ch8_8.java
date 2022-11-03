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
public class Ch8_8 {
    enum Fruit{
        APPLE,
        KIWI,
        CHARRY
    }
    public static void main(String[] args) {
       //Fruit 是一個類別 他繼承了 enum 
       //Apple Kiwi Charry 都是 Fruit的物件
       //以上物件由java建立 不可自己new
       //不可自己繼承enum
       Fruit f1 = Fruit.CHARRY;
       System.out.println(f1);
       
      switch(f1){
          case APPLE:
              System.out.println("100元");
              break;
          case KIWI:
              System.out.println("20元");
              break;
          case CHARRY:
              System.out.println("10元");
              break;
      }
      
      
   
      final int RUN =1;
      final int JUMP = 2;
      final int WALK = 3;
         int action =WALK;
      switch(action){
          case RUN :
              System.out.println("Run");
              break;
         default:
              break;         
          case JUMP:
              System.out.println("Jump");
              break;
          case WALK:
              System.out.println("Walk");
              break;
          
      }
      
        
        
        
    }
    
}
