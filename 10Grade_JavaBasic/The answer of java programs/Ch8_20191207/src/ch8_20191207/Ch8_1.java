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
public class Ch8_1 {
       private int weight = 86;
   
    //內部類 可讀取 外部非靜態與靜態屬性
    //靜態內部類 可讀取 外部靜態屬性
    //匿名內部類 可讀取 外部非靜態的與靜態屬性
        static class StatcInnerClass2{
            private int testValue = 95;
           public StatcInnerClass2(int testValue){
               this.testValue = testValue;
           }
              public String toString(){
               return String.valueOf(testValue);
           }
       }
        
        class InnerClass2{
        private int value = 10;
        private String name;
        public InnerClass2(int value,String name){
            this.value = value;
            this.name = name;
        }
        
        public String toString(){
            return name+":"+value+":"+weight;
        }
    }
       private static class StatcInnerClass{
           private int testValue = 95;
           public StatcInnerClass(int testValue){
               this.testValue = testValue;
           }
           public String toString(){
               return String.valueOf(testValue);
           }
       }
    private class InnerClass{
        private int value = 10;
        private String name;
        public InnerClass(int value,String name){
            this.value = value;
            this.name = name;
        }
        public String toString(){
            return name+":"+value+":"+weight;
        }
    }
    
    void test1(){
        InnerClass inc = new InnerClass(20,"AA");
    }
    public static void main(String[] args) {
     Ch8_1 ch8 = new Ch8_1();
     Ch8_1.InnerClass inc3 = ch8.new InnerClass(20,"AA");

          //InnserClass inc2 = new InnserClass(20,"AA");
        System.out.println(inc3);
        
      StatcInnerClass sic = new StatcInnerClass(72);  
        System.out.println(sic);
    }
    
}
