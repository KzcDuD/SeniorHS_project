/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.Optional;
import java.util.OptionalInt;
public class Ch11_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //OptionalInt op = OptionalInt.of(20);
       OptionalInt op = OptionalInt.empty();
       if (op.isPresent()){
           System.out.println(op.getAsInt());
       }
      
      
    }
    
}
