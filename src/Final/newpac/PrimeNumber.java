/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.newpac;

//Problem-Find out the Prime number from n values.

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you check: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            if (isPrime(num)) {
                System.out.println(num + " is Prime");
            }else{
                System.out.println(num + " is Not Prime");
            }       
        }
    }
}
   
    
