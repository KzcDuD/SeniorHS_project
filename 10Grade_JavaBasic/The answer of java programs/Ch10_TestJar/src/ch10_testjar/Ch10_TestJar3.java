/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_testjar;
import java.util.TreeSet;
import java.util.Comparator;
import howard.test.pbj.Employee;
public class Ch10_TestJar3 {

    private static int cmpEmployee(Employee e1,Employee e2){
           int v = e1.getSalary() - e2.getSalary();
           if (v == 0) v = e1.getYear()- e2.getYear();
           if (v == 0) v = e1.getName().compareTo(e2.getName());
           return v;
        
    }
    
    //Java8 專用招
    public static void main(String[] args) {
        // TODO code application logic here
      Employee emp1 = new Employee("Vivin",200,20170506);
      Employee emp2 = new Employee("Ken",150,20180506);
      Employee emp3 = new Employee("Iris",150,20190506);
      Employee emp4 = new Employee("Join",150,20190506);
      //comparing 回傳的內容 必須能夠排序(一定要實作Comparable)
      Comparator<Employee> cmp =
              Comparator.<Employee,Integer>comparing(emp->emp.getSalary()).
                      thenComparing(emp->emp.getYear()).
                      thenComparing(emp->emp.getName());
            //TreeSet<Employee> set = new TreeSet<>(cmp);
       //使用 lambda 排序
       Comparator<Employee> cmpLam = (e1,e2)->{
                int v = e1.getSalary() - e2.getSalary();
                if (v == 0) v = e1.getYear()- e2.getYear();
                if (v == 0) v = e1.getName().compareTo(e2.getName());
           return v;};
//        TreeSet<Employee> set = new TreeSet<>(cmpLam);

  // Method Reference
        TreeSet<Employee> set = new TreeSet<>(Ch10_TestJar3::cmpEmployee);
      set.add(emp1);
      set.add(emp2);
      set.add(emp3);
      set.add(emp4);
      set.forEach(System.out::println);
    }
    
}
