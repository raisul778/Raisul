/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.oop;

/*(Inheritance with method overriding)
Create a class Vehicle and create a method name vehicleRun, create another class name Car and inherit the vehicle class,
Override the vehicleRun method in the Car class and print the both methods.*/
public class Vehicle {
      void vehicleRun(){
        System.out.println("The Vehicle is Running");
    }
}

class Car extends Vehicle{

    @Override
    void vehicleRun() {
        System.out.println("The Car is Running"); 
    }
}

class test{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.vehicleRun();
        
        Car c = new Car();
        c.vehicleRun();
    }
}

