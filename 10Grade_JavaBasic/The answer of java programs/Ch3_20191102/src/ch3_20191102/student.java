/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20191102;
import java.util.Arrays;
/**
 *
 * @author student
 */
public class student {
    private int id;
    private String name;
    private int[] scores = new int[3];
    private int index = -1;
    
    student(){
        
        this(-1,"空白");
//        this.id = -1;
//        this.name = "空白";
//        Arrays.fill(scores, -1);
        
    }
    student(int id,String name){
        this.id = id;
        this.name = name;
        Arrays.fill(scores , -1);
    }
    
    public void setId(int id){
        
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
        
      
    } 
    void appendScore(int score){
        if( index  == scores.length -1){
            System.out.println("超過可寫長度");
            return;
        }
        scores[++index] = score;
    }
    void printScore(){
        boolean showScore =false;
       for(int s : scores){
           if(s != -1){
        System.out.print(s+" ");
         showScore =true;
           }
       }
        if(!showScore)  System.out.println("無成績"); 
        else System.out.println();
       }
    void print(){
        System.out.println(id+":"+name);
    }

    void appendScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
