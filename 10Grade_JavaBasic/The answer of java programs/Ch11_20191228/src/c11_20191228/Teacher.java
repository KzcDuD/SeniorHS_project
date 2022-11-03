/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
public class Teacher {
   private String name;
   
   public void setName(String name){
       this.name = name;
   }
   public Optional<String> getName(){
       return Optional.ofNullable(name);
   }
     private ArrayList<String> list = new ArrayList(){
            public Object clone(){
                 ArrayList<String> newList = new  ArrayList<String>();
                 for(Object v : this){
                     newList.add(v.toString());
                 }
                return newList;
            }
     };
    public Teacher(){
        list.add("Book1");
        list.add("Book2");
        list.add("Book3");
    }
    public void addBook(String name){
        list.add(name);
    }
    public ArrayList<String> getBook(){
        return (ArrayList)list.clone();
    }
    public Stream<String> getBookStream(){
        return list.stream();
    }
    //1 可寫入新書
    //2 可讀取書名列表
    //3 只能呼叫Teacher的方法對Book列表做修改
    
}
