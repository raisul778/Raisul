/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raisul Islam
 */
public class Test {
    public static void main(String[] args) { 
        List<Person> p = new ArrayList<>(); 
    Person p1 =(new Person(101, "Raisul", 50000)); 
    Person p2 =(new Person(102, "Hasan", 45000)); Person p3 =(new Person(103, "Karim", 30000)); 
       p.add(p1); p.add(p2); p.add(p3); 
          for (Object object : p) { 
              System.out.println(p); 
          } 
    }
}
