/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20200118;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
public class Ch13_3 {
    public static void main(String[] args) {
	//Path immutable 不可改
	Path path = Paths.get("C:", "MyDir","Dir1");
	//count 為 2 因為根不算在nameCount
	System.out.println(path.getNameCount());
	Path path2 = Paths.get("C", "MyDir","Dir1");
	//count 為 3 因為C不算根目錄
	System.out.println(path2.getNameCount());

	Path path3 = Paths.get("C:", "A","B","C","D");
	System.out.println( path3.subpath(1, 3)); 
	
	Path path4 = Paths.get("C:", "A","B");
	Path path5 = Paths.get("myFile.txt");
	Path path6 = path4.resolve(path5);
	System.out.println(path6);
	
	Path path7 = Paths.get("C:", "A","B");
	Path path8 = Paths.get("d:","myFile.txt");
	//如果右邊的Path有根目錄時會取代左邊的Path
	Path path9 = path7.resolve(path8);
	System.out.println(path9);
	
	Path path10 = Paths.get(".","dir1","..","dir1");
	System.out.println(path10);
	System.out.println(path10.normalize());
    }
    
}
