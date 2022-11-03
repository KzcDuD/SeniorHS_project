/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20191102;

/**
 *
 * @author student
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student st1 = new student(10,"ken");
        st1.print();
        st1.appendScore(50);
        st1.appendScore(83);
        st1.appendScore(92);
        st1.appendScore(89);
        st1.printScore();

        System.out.println("=================================");
        student st2 =new student();
        st2.print();
        st2.printScore();
        
    }
    
}
