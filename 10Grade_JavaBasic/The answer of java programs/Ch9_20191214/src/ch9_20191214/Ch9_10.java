/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Ch9_10 {

    public static void main(String[] args) {
        // TODO code application logic here
        //速度排名 Hash List Tree
        HashSet<String> set = new LinkedHashSet<>();
        set.add("Ken");
        set.add("Iris");
        set.add("Join");
        set.add("Iris");
        
        set.forEach(System.out::println);
        
        
    }
    
}
