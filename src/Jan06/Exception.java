/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author Raisul Islam
 */
public class Exception {
    public static void main(String[] args) {

        try {
           
            int a = 10, b = 0;
            int result = a / b;   
            int[] arr = {1, 2, 3};
            
            System.out.println(arr[5]); 
  
            String name = null;
            System.out.println(name.length()); 
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred: " + e);
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred: " + e);
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}

