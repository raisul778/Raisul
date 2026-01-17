/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.oop;
/*Create a sub class of Vehicle class and name it as Truck. The Truck class has the following fiels and methods.
*int weight;
-Now override the double getSaleprice() method from its super class and apply the following logic-
If weight>2000, 10% discount. Otherwise no discount no regular price.*/

import Final.mid.Vehicle;

public class Truck extends Vehicle {
    int weight;

    double getSalePrice() {
        if (weight > 2000) {
            double regularPrice = 0;
            return regularPrice - (regularPrice * 0.1);  // 10% discount
        } else {
            double regularPrice = 0;
            return regularPrice;
        }
    }
}
