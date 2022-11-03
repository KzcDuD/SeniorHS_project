/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;
public class Ch6_9 {

        
    static void testUsb(USB usb,String[] data){
        usb.input(data);
        String[] out = usb.output();
        for (String v : out){
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        SSD sd = new  SSD();
       testUsb(sd,
         new String[]{"Data1","Data2","Data3"});
       sd.input( new String[]{"Data1","Data2","Data3"});
       
//       SDCard sdcard = new SDCard();
//        testUsb(sdcard,
//         new String[]{"Data1","Data2","Data3"});
       
    }
    
}
