/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author Raisul Islam
 */
public class Thread {
    void x() {
        System.out.println("X");
    }

    void y() {
        System.out.println("Y");
    }

    public static void main(String[] args) {

        Test tt = new Test();

        for (int i = 0; i < 5; i++) {
            tt.x();
        }

        for (int i = 0; i < 5; i++) {
            tt.y();
        }

        A a = new A();
        a.x();

        B b = new B();
        b.y();
    }
}

class A {
    void x() {
        System.out.println("X");
    }
}

class B {
    void y() {
        System.out.println("Y");
    }
}
class X extends Thread {
    public void run() {
        System.out.println("X");
    }
}

class Y extends Thread {
    public void run() {
        System.out.println("Y");
    }
}


    