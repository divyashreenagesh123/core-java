// example for methods accepting objects as arguments
class Test{}
class Emp{}
class Y{}
class Student{}
public class Methods3 {

    void m1(Test t, Emp e) {
        System.out.println("method 1 accepting t and e objects of class test and emp");
    }

    static void m2(Y y, Student stud) {
        System.out.println("method 2 accepting y and stud objects of class Y and Student");
    }

    public static void main(String[] args) {
        Methods3 m = new Methods3();
        m.m1(new Test(), new Emp());
        Methods3.m2(new Y(),new Student());
    }
}
