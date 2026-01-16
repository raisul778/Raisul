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
public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many number you check: ");
        int n = input.nextInt();
        System.out.println("Enter a value: ");
        double num = input.nextDouble();
        double max = num;
        double min = num;
        for (int i = 0; i < n - 1; i++) {
            num = input.nextDouble();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = max;
            }
        }
        System.out.println("Maximum number = "+ max);
        System.out.println("Minimum number = "+ min);

    }
}
