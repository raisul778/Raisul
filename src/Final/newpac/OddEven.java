/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.newpac;

//Problem- Find out the Odd-even number among n number of values.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you check: ");
        int n = sc.nextInt();
        System.out.println("Enter the number: ");
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            }else{
                System.out.println(num + " is Odd");
            }          
        }
    }
}
