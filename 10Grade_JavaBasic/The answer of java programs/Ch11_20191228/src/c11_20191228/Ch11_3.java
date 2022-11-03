/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.stream.IntStream;
/**
 *
 * @author xvpow
 */
public class Ch11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IntStream.rangeClosed(20, 30).
               forEach(System.out::println);
    }
    
}
