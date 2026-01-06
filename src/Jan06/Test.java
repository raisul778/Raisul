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
public class Test {
    static final Test LOCK = new Test();
    public static void main(String[] args) throws InterruptedException {
        java.lang.Thread tick = new java.lang.Thread(new X());
        java.lang.Thread tock = new java.lang.Thread(new Y());
        tick.start();
        tock.start();
        tick.join();
        tock.join();
    }

    void x() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
