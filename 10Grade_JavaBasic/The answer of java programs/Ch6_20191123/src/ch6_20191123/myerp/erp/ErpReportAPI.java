/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123.myerp.erp;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public abstract class ErpReportAPI {
    private List<String> readData(){
      Path path =  Paths.get("C:","MyDir","Data.txt");
      List<String> datas = new ArrayList<>();
      try{
          datas = Files.readAllLines(path);   
      }catch(IOException ex){
          System.out.println(ex);
      }
        return datas;
    }
    
    public void exportReport(){
        List<String> datas= readData();
        reportStyle(datas);
    }
    
    protected abstract void reportStyle(List<String> data);
}
