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
public class Super {
   public static void main(String[] args) {
        System.out.println("This is parent class");
    }

    void SuperMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Sub extends Super{
    public void SubMethod(){
        System.out.println("This is child class");
    }
}
class T{
    public static void main(String[] args) {
        Super obj = new Super();
        obj.SuperMethod();
        
        Sub obj1 = new Sub();
        obj1.SubMethod();
        obj1.SuperMethod();
    }
}
