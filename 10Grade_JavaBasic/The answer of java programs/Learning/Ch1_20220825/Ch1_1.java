package Learning.Ch1_20220825;
import java.util.*;


public class Ch1_1{

    public static void main(String[] args) {
        int [] array =new int[3];
        array[0]= 18;
        array[1]= 25;
        array[2]= 71;

        for(int i=0;i< array.length;i++) {
            System.out.println(array[i]);
        }
       
        System.out.println("================");
        Arrays.stream(array).forEach(System.out::println);
    }

}