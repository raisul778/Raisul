/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.newpac;




/**
 *
 * @author Raisul Islam
 */
public class ArraySortiog {
   public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
