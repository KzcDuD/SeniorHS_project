/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116.practice;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {
    
    public static void main(String[] args) {
       //Animal
       //Dog
       //Cat
       
       //所有動物都有以下屬性
      // name age height
      
     //設定dog的身高不可小於0 大於 130
     //設定cat的身高不可小於0 大於 100
     //如Dog超過範圍 拋出 DogHeightException
     //如Cat 超過範圍拋出 CatHeightException   
       
    //於Ch5_5 寫一隻方法 可接收所有的Dog 與 Cat 並且印出它們的
    //如果是 Dog 就顯示 dog:name:age:height
    //如果是 Cat 就顯示 cat:name:age:height
     
    //希望可以比較是否為同一隻動物
    //只能Dog跟Dog比
    //Cat跟Cat比        
    //寫一個方法可傳入一群動物,移除相同的動物 回傳不同動物的陣列出來
    DogHeightException dogex = 
            new DogHeightException("身高不可小於0 大於 130");
    DogHeightCondition doHC = new DogHeightCondition();
    DogVerifyCondition dogVc = 
            new DogVerifyCondition(dogex,doHC);
     Animal dog1 = new Dog("DoDo",2,5,dogVc);
     System.out.println(dog1.getName());
     System.out.println(dog1.getHeight());
    }
    
}
