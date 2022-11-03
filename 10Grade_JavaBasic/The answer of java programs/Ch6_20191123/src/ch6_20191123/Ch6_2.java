 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Employee emp1 = new Employee("Ken");
//        System.out.println(emp1);
//        emp1.viewTodoList();
        
          Employee emp2 = new Employee("Ken",25);
         System.out.println(emp2);
         emp2.viewTodoList();
         
           Employee emp3= new Employee("Ken",25,100);
           emp3.viewTodoList();
           
           emp3.viewKpi();
           
         
    }
    
}
