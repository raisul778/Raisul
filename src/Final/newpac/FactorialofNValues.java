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
public class FactorialofNValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers you check? ");
        int n = input.nextInt();
        int factorial = 1;
        System.out.println("Enter your numbers: ");
        for (int i = 0; i<n; i++){
            int num = input.nextInt();
        
        for (int j = 1; j<=n; j++){
            factorial *=j;
        }
            System.out.println("Factorial of "+ num + " is " + factorial + ".");
            factorial = 1;
    }
    }
}
