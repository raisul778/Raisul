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
public class Arithmetic {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;

        try {
            int result = a / b;   
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }

        System.out.println("Program continues normally.");
    }
}
