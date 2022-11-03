/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;
import java.util.function.Function;
public class Ch8_5 {

    static void testFunction(Function<String,Integer> f,String value){
        System.out.println(f.apply(value));
    }    
    public static void main(String[] args) {
        // TODO code application logic here
//        testFunction(new Function<String,Integer>(){
//                public Integer apply(String st){
//                    return st.length();
//                }
//        },"ABCDE");//希望輸出5
     
        //一定是 FunctionalInterface 才可使用  lambda 
        //不會產生內部類
        //testFunction(s->s.length(),"ABCDE");
       testFunction((String s)->s.length(),"ABCDE"); 
       //沒{}不用;
       testFunction((String s)->{
           return s.length();},"ABCDE"); 
       
       
    }
    
}
