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
public class Circle {
    private double radius;
    private double area;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }   
}
class Test{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(4.5);
        double radii = c.getRadius();
        double areaa = radii * radii * Math.PI;
        
        c.setArea(areaa);
        System.out.println("c.getArea()");
    }
}
