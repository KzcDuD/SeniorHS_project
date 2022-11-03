/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;
public class Student {
    private String name;
    private int score;
    
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public String toString(){
        return this.getScore()+":"+this.getName();
    }
    
    public int hashCode(){
        return this.score+this.name.hashCode();
    }
    
    public boolean equals(Object obj){
        if (obj == null || obj.getClass() != Student.class){
            return false;
        }
        Student st = (Student) obj;
        return st.getName().equals(this.getName()) && st.score == this.score;
    }
}
