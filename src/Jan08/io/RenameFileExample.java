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
public class RenameFileExample {
    public static void main(String[] args) {
        File oldfile = new File("e:\\a.text");
        File newfile = new File("e://ab.text");
        
        if (oldfile.renameTo(newfile)) {
            System.out.println("Reanme successful");
        }else{
            System.out.println("Rename failed");
        }
    }
}
