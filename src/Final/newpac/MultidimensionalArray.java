/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.newpac;

import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 int arrayElement = (int) (Math.random() * 100);
                 arr[i][j] = arrayElement;
             }             
        }
             System.out.println("Given array: " + Arrays.deepToString(arr));
             
         for (int i = 0; i < arr.length; i++) {
              sort(arr[i]);
        }
             System.out.println("Sorted array: " + Arrays.deepToString(arr));
    }   
    
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k; 
                }
                
            }
        }
    }
}

