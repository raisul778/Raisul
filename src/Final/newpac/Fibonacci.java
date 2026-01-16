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
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many number you show: ");
        int n = input.nextInt();
        int[] fibonacci = new int[n];
        System.out.println("Fibonacci numbers up to " + n + " terms: [");
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        System.out.println(fibonacci[0] + ", "+ fibonacci[1]);
        for (int i =2; i < n; i++){
            fibonacci[i] = fibonacci[i -1] + fibonacci[i - 2];
            System.out.println(", " + fibonacci[i]);
        }
        System.out.println("] \n");
    }
}
