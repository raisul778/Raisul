/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan08.io;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Raisul Islam
 */
public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("e:\\a.text");
            if(file.createNewFile()) {
                System.out.println("File is Creating");           
            }else{
                System.out.println("File alrady exist");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
