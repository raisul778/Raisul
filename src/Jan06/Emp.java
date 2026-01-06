/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

import java.util.*;

public class Emp {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Raisul", 50000, 25));
        employees.add(new Employee(102, "Ahmed", 60000, 28));
        employees.add(new Employee(103, "Sajib", 55000, 26));

        for (Employee e : employees) {
            System.out.println("ID: " + e.id +", Name: " + e.name +", Salary: " + e.salary + ", Age: " + e.age);
        }
    }
}


