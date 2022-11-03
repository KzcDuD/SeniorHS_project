/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123.myerp.report;
import ch6_20191123.myerp.erp.ErpReportAPI;
import java.util.List;

public class ErpRpoert  extends ErpReportAPI{
    
   private void myStyle(String s1){
     String[] styleArray=  s1.split(",");
     System.out.printf("姓名:%s 第一季:%s%% 第二季:%s%% 第三季:%s%% %n",
             styleArray[0],styleArray[1],styleArray[2],styleArray[3]);
   }
   
  protected  void reportStyle(List<String> data){
        data.forEach(this::myStyle);
  }
}
