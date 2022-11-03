/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_testjar;
import java.util.TreeSet;
import java.util.Comparator;
import howard.test.pbj.Employee;
public class Ch10_TestJar2 {
    private static class MyComparator implements Comparator<Employee>{
        public int compare(Employee e1,Employee e2){
            int cmp =  e1.getSalary() - e2.getSalary();
            if (cmp == 0) cmp =  e1.getYear()- e2.getYear();
            if (cmp == 0) cmp =  e1.getName().compareTo(e2.getName());           
         return cmp;
        }
    }
     //通用招
    public static void main(String[] args) {
        // TODO code application logic here
      Employee emp1 = new Employee("Vivin",200,20170506);
      Employee emp2 = new Employee("Ken",150,20180506);
      Employee emp3 = new Employee("Iris",150,20190506);
      Employee emp4 = new Employee("Join",150,20190506);
      MyComparator myc = new MyComparator();
      TreeSet<Employee> set = new TreeSet<>(myc);
      set.add(emp1);
      set.add(emp2);
      set.add(emp3);
      set.add(emp4);
      set.forEach(System.out::println);
      
    }
    
}
