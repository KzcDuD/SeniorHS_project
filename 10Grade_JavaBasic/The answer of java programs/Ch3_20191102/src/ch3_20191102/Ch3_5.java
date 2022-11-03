package ch3_20191102;
public class Ch3_5 {

    public static void main(String[] args) {
        Animal an1 = new Animal("BoBo",5 , 6);
        an1.print();
        
        Dog dog1 =new Dog();
        dog1.setName("NiNi");
        dog1.setAge(2);
        dog1.setHeight(3);
        dog1.print();
        
        Dog dog2 = new Dog("Yun",5,3);
        dog2.print();
        
        Cat cat1 = new Cat("GiGi",2,3);
        cat1.print();
        
    }
    
}
