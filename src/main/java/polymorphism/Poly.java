package polymorphism;

import inheritance.CheckInterface;
import inheritance.Inheritance1;
import inheritance.Inheritance2;

// ability to appear in many forms
// types: compile time polymorphism -(method overloading),  runtime polymorphism(method overriding)
// types of overloading: method overloading, constructor overloading, operator overloading
public class Poly {

    Poly(){
        System.out.println("1. class containing more than one constructor with same name with different arguments or data types\n");
    }
    Poly(int a){
        System.out.println("2. constructor with same name with int argument");
    }

    void m1(){
        System.out.println("3. method 1 with 0 argument");
        // class containing more than one method with same name with different arguments or data types

    }
    void m1(int a){
        System.out.println("4. second method with int argument");
    }
    void m1(String st){
        System.out.println("5. third method with string argument");
    }
     CheckInterface colours() {
       System.out.println("6.RED COLOUR");
       int a = 10;
       return new Inheritance2();
   }

    public static void main(String[] args) {
        Poly p = new Poly();
     new Poly(9);


        p.m1();
        p.m1(10);
        p.m1("method overloading");
        System.out.println("one operator performing more than one operation is Operator overloading");
        System.out.println("operator overloading is not supported by JAVA");
    }
}
