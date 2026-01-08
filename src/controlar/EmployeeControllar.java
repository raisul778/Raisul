/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlar;

import model.Employee;
import service.EmployeeService;

/**
 *
 * @author Hp
 */
public class EmployeeControllar {
    public Employee create(Employee e){
        EmployeeService es = new EmployeeService();
        Employee emp = es.save(e);
        return emp;
    }
}
