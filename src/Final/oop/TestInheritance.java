/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.oop;

class Person {
    String name = "Raisul";
}

class Student extends Person {
    int id = 1291410;
}
public class TestInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name);
        System.out.println("ID: " + s.id);
    }
}
