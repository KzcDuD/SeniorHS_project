/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109.test;
import ch4_20191109.TestModfily;
/**
 *
 * @author shihhaochiu
 */
public class MyTest extends TestModfily {
    public void test1(){
        this.protectedValue = "MyProtected";
    }
    public String getProtectValue(){
        return this.protectedValue;
    }
    
}
