
package ch2_20191026;

public class Ch2_3 {

 
    public static void main(String[] args) {
        /*
        =========Start============
1 1 1 
=========End============
        =========Start============
2 2 2 
=========End============
        =========Start============    
 =========Start============   
        444
=========End============  
 =========Start============   
        555
=========End============                
        */
        //考
        Tag1:
        for (int i =1; i<=5 ;i++){
           System.out.println("=========Start============");
            for (int k = 1;k <= 3;k++){
                if ( i == 3){
                    //break Tag1;
                      continue Tag1;
                }
                System.out.print(i+" ");
            }
             System.out.println();
          System.out.println("=========End============");
        }
        
    }
    
}
