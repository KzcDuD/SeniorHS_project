/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;
import java.util.ArrayList;
import java.util.HashMap;
public class Ch10_6 {


    public static void main(String[] args) {
        Student st1 = new Student("Ken",100);
        Student st2 = new Student("Lindy",70);
        Student st3 = new Student("Ken",50);
        Student st4 = new Student("Lindy",80);
        Student st5 = new Student("Ken",90);
        Student st6 = new Student("Lindy",30);
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        
        //幫我輸出 Ken 的總成績 Lindy 的總成績
        
        HashMap<String,Integer> map 
                = new HashMap<String,Integer>();
        
//        for (Student st : list){
//           String key =  st.getName();
//           int score =  st.getScore();
//            if (map.containsKey(key)){
//               score+=map.get(key);
//            }
//            map.put(key, score);
//        }
//java 8
      for (Student st : list){
            map.merge(st.getName(), st.getScore(), (s1,s2)->s1+s2);
        }
        System.out.println(map);
        
    }
    
}
