/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.exception;

/**
 *
 * @author Raisul Islam
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
}
