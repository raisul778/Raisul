/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.mid;

/**
 *
 * @author Hp
 */
public class Vehicle {
    void vehicleRun(){
        System.out.println("This is running");
    }
}
class Car extends Vehicle{

    @Override
    void vehicleRun() {
        System.out.println("The car is running"); 
    }   
}
class Tes{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.vehicleRun();
    }
}
