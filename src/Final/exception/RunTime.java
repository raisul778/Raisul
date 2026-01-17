/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.exception;

/**
 *
 * @author Hp
 */
public class RunTime {
       public static void main(String[] args) throws Exception {
           int a = 300;
           int b = 500;
           if(a > b) {
               throw new Exception ("empty c");
           }else{
               System.out.println("Success");
           }
    }
}
