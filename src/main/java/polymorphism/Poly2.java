package polymorphism;

import inheritance.Inheritance1;
import inheritance.Inheritance2;
import inheritance.Inheritance4;

public class Poly2 extends Poly {
    @Override
    Inheritance2 colours() {
        System.out.println("White colour");
        System.out.println("RED COLOUR");
        return new Inheritance4();
    }

    void ruleOfPoly() {
        System.out.println("1. In order to override, method signature must be same");
        System.out.println("2.return type must be same BUT RETURN TYPE CAN BE CHANGED AT CLASS LEVEL");
        System.out.println("3. covariant data type - while creating object you can have class name as object type");
        System.out.println("4. if method is declared final, then that method can not override");
        System.out.println("5. if variable is declared final then you can not reassign values");
        System.out.println("6. if class is declared final then the methods inside are final methods by default however final class variables are not final variables");
        System.out.println("7. type casting : in order to access child class methods from parent datatype in object creation, do the type cast so that you dont have to create another object.");
        System.out.println("example of type casting:  Child c = (Child)p;");
        System.out.println("8.can not override static methods BECAUSE STATIC METHODS ARE BONDED WITH CLASS");
        System.out.println("9.scope of private modifiers are within the class and can not override this method");
    }

}


class Parent {
    private void mom() { // scope of private modifiers are within the class and can not override this method
        System.out.println("parent mom");
    }
    static void moms(){
            System.out.println("parent static mom");
    }
    protected void m123(){}


}
 class Child extends Parent{
    void mom(){
        System.out.println("child's mom");
    }

    static void moms(){
         System.out.println("child static mom");
     }

    void mom3(){
        System.out.println("child's mom3");
    }
    public static void main(String[] args) {
        //final int a=5;
        //a = a+1;
        Parent p = new Child();
        Parent p1 = new Parent();

        Child c1 = (Child) new Parent();//type casting

        p.moms(); // coz it is static
        Child c = (Child)p;//TYPE CASTING
        c.mom3();
        //p.mom3();
        /*Child ch = new Child();
        ch.mom();
        ch.mom3();*/



        //new Poly2().colours();
    }

}

