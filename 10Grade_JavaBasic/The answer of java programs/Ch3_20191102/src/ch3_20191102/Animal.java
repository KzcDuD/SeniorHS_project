package ch3_20191102;
public class Animal {
    private String name;
    private int age;
    private float height;
    
    Animal(){
        
    }
    Animal(String name,int age,float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age =age;
    }
    int getAge(){
        return age;
    }
    void setHeight(float height){
        this.height = height;
    }
    float getHight(){
        return height;
    }
    
   void print(){
       System.out.println(name+":"+age+":"+height);
    }
    
}
