/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

/**
 *
 * @author Raisul Islam
 */
public class Person {
    int id;
    String name;
    double salary;
    
    Person(int id, String name, double salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
    }
    void display() {
        System.out.println("id + name + salary");
    
    }
    
}