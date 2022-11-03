/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20191123;
public class TestBlock {
      TestBlock(){
          System.out.println("TestBlock()!");
      }
      {
         System.out.println("Block 1");
      }
      static{
        System.out.println("static Block 1");   
      }
      {
         System.out.println("Block 2");             
      }
      static{
        System.out.println("static Block 2");   
      }
}
