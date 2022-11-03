/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;
import java.util.function.Function;
import java.util.function.BiFunction;
public class Ch8_7 {

   static void printLength(Function<String,Integer> f,String st){
       System.out.println(f.apply(st));
   }
   
   static void printStudent(BiFunction<String,Integer,Student> bf,
                        String name,Integer score){
       Student st = bf.apply(name, score);
       System.out.println(st);
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        String st = "Iris";        
         printLength(String::length,st);  
         
         printStudent((n,s)->new Student(n,s),"Iris",95);
         printStudent(Student::new,"Ken",72);
    }
    
}
