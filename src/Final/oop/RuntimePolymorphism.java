/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final.oop;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
          Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
