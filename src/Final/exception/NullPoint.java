/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.exception;

/**
 *
 * @author Hp
 */
public class NullPoint {
    public static void main(String[] args) {
         String s = null;

        try {
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Cannot perform operation on null.");
        }
    }
}
