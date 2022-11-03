/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20190104;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Student extends Person implements Serializable   {
    private String name;
    private int age;

    public Student(String name, int age) {
	    super(name);
	this.name = name;
	this.age = age;
    }

    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }

    @Override
    public String toString() {
	return "Student{" + "name=" + name + ", age=" + age + '}';
    }

    
    
}
