/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;
import java.util.Optional;
public class Ch11_11 {
    public static void main(String[] args) {
      Optional<String> emptyOp = Optional.empty();
        //不可null
      Optional<String> ofOp = Optional.of("");
        //可null
      Optional<String> ofNullableOp = Optional.ofNullable("");
             
        //ofOp = Optional.of(null);
        // Optional.ofNullable(null);
        
//      Optional<String> ofNullableOp2 = Optional.ofNullable("Join");   
//      String v1 = ofNullableOp2.get();
//      System.out.println(v1);
//       Optional<String> ofNullableOp3 = Optional.ofNullable(null); 
//      // if (ofNullableOp3.isPresent()){
//             ofNullableOp3.get();//如果內容為null會拋出例外
//       //}
      Optional<String> ofNullableOp4 = Optional.ofNullable(null); 
    String v2 = ofNullableOp4.orElse("Empty");
      System.out.println(v2);
   String v3 = ofNullableOp4.orElseGet(()->{
          java.util.Random ran = new   java.util.Random();
          return ran.nextInt()+"";
       });
     System.out.println(v3);
     //當內容為null時拋出例外
     ofNullableOp4.orElseThrow(RuntimeException::new);
     
    }
    
}
