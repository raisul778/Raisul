/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

import java.util.*;
public class RollSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> roll = new HashSet<>();
        
        System.out.println("`Enter a roll numbers(-1 to stop):");
        while (true){
            int r = sc.nextInt();
            if (r == -1)
                break;
            roll.add(r);
        }
        System.out.println("Unique Roll Numbers: "+ roll);
    }
}
