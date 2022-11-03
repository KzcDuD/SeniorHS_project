/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123.myerp.erp;
import java.util.List;
/**
 *
 * @author xvpow
 */
 class UnitTest extends ErpReportAPI {

    public void reportStyle(List<String> data){
        data.forEach(System.out::println);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UnitTest ut = new UnitTest();
       ut.exportReport();
    }
    
}
