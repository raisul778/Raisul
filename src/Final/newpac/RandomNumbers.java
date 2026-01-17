/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.newpac;

import java.util.HashSet;
import java.util.Random;

//Problem-Find out the ten unique Random Numbers
public class RandomNumbers {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Random rand = new Random();
        
        while (numbers.size() <10) {
            int num = rand.nextInt(50);
            numbers.add(num);
        }
        System.out.println("Ten unique random numbers: ");
        for(int n: numbers) {
            System.out.println(n + " ");
        }
    }
}
