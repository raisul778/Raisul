/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> marks = new ArrayList<>();
        System.out.println("Enter Marks (-1 to stop)");
        while(true){
            int m = sc.nextInt();
            if (m == -1)
                break;
            marks.add(m);       
        }
        System.out.println("All Marks: "+marks);
    }
}
