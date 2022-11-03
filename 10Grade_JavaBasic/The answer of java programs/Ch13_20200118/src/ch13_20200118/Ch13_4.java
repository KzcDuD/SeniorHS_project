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
public class Ch13_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
	Path srcPath = Paths.get("C:","MyDir","test.zip");
	Path targetPath = Paths.get("c:", "MyDir","test_copy.zip");
	//如果沒加上REPLACE_EXISTING 檔案重複copy會出錯
	// 不能加入ATOMIC_MOVE
	Files.copy(srcPath, targetPath,StandardCopyOption.REPLACE_EXISTING,
		StandardCopyOption.COPY_ATTRIBUTES);
    }
    
}
