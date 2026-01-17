/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.oop;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class CompileTimePolymorphism {
     public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 3));
        System.out.println(c.add(5, 3, 2));
    }
}
