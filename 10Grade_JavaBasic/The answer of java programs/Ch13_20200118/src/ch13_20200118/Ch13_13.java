/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class Ch13_13 {

    public static void main(String[] args)throws Exception {
	// TODO code application logic here
	//DriverManager 取得資料庫連線
	//Connection 連線資料庫
	//Statement 下達指令
	//ResultSet 查詢後的結果
	String url = "jdbc:derby://localhost:1527/mytestdb";
	String user = "qwer";
	String password = "12345";
	Connection conn = DriverManager.getConnection(url, user, password);
	//SQL 的字串要用單引號
	//新增的指令
	java.util.Random r = new java.util.Random();
	String sql = "INSERT INTO student(id,stName) VALUES("+r.nextInt(50000)+",'Howard')";
	Statement stm = conn.createStatement();
	stm.executeUpdate(sql);
	//查詢的指令
	String querySql = "SELECT * FROM student";
	ResultSet resultSet = stm.executeQuery(querySql);
	while(resultSet.next()){
	  int id =   resultSet.getInt(1);//由1開始.....
	   String name =  resultSet.getString(2);
	   System.out.println(id+":"+name);
	}
	
    }
    
}
