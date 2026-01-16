/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan08.io;

import java.io.File;

/**
 *
 * @author Raisul Islam
 */
public class DeleteFileExample {
    public static void main(String[] args) {
        File newfile = new File("e://ab.text");
        if(newfile.delete()) {
            System.out.println("Delete successfull");
        }else{
            System.out.println("Delete failed");
        }
    }
}
