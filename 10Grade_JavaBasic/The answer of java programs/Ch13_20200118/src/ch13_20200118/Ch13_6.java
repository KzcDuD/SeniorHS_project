/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

public class Ch13_6 {
    public static void main(String[] args)throws Exception {

	Path srcPath = Paths.get("C:","MyDir","myFile.txt");
	List<String> list = Files.readAllLines(srcPath);
	list.forEach(System.out::println);
	
	//讀取某路徑下的內容
	//只有一層
	Path dirPath = Paths.get("C:","MyDir");
	Stream<Path> strPathStr =  Files.list(dirPath);
	strPathStr.forEach(System.out::println);
	//讀文字檔
	Path srcPath2 = Paths.get("C:","MyDir","myFile.txt");
	Stream<String> lineStream=  Files.lines(srcPath2);
	lineStream.forEach(System.out::println);
	// 預設maxDepth 為 int 最大值 2147483647
	//可指定層的深度
	//"C:","MyDir" 此為第0層
	Stream<Path> waklSt =  Files.walk(dirPath, 3);
	System.out.println("=====================");
	waklSt.forEach(System.out::println);
    }
    
}
