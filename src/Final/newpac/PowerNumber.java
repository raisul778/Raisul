/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.newpac;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        
        System.out.println("Enter the exponent: ");
        int exp = sc.nextInt();
        int result = 1;
        
        for (int i = 0; i < exp; i++) {
            result = result * base;         
        }
        System.out.println("Result: " + result);
    }
}
