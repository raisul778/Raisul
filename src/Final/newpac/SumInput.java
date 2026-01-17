/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.newpac;

//Problem -Find out the Conditional Sum until input 0(zero).

import java.util.Scanner;

public class SumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, sum = 0;
        System.out.println("Enter number (o to stop):");
        
        while (true) {
            num = sc.nextInt();
            
            if (num ==0) {
                break;
            }
            sum = sum + num;
        }
        System.out.println("Conditional Sum = "+ sum);
    }
    
}
