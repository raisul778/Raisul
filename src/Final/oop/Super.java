/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.oop;

/*
 Create a class with a method that prints â€œThis is parent classâ€� and its subclass with another method that prints â€œThis is child classâ€�. Now, create an object for each of the class and call
1.	Method of parent class by object of parent class
2.	Method of child class by object of child class
3.	Method of parent class by object of child class
 */
public class Super {
     public void SuperMethod(){
        System.out.println("This is a Parent class");
    }
}

class Sub extends Super{
    public void SubMethod(){
        System.out.println("This is a Child class");
    }
}

class Test{
    public static void main(String[] args) {
        Super obj = new Super();
        obj.SuperMethod();
        
        Sub obj1 = new Sub();
        obj1.SubMethod();
        obj1.SuperMethod();
    }
}
