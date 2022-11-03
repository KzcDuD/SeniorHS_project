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
public class Student {
    private String name;
    private int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return name+":"+score;
    }
}
