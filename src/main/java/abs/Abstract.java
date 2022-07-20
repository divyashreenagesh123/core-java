package abs;

public abstract class Abstract {
    abstract void m1(); // in order to have abstract methods class needs to be abstract
    abstract void m2();//abstract methods can not have a body
    void m3(){
        System.out.println("m3 method");
    }
}
class Abs extends Abstract{
// when we are extending abstract class we are required to implement abstract methods
// or we can declare the implementation class as Abstract class
    @Override
    void m1() {
        System.out.println("m1 method");//
    }

    @Override
    void m2() {
        System.out.println("m2 method");
    }
    void m4(){
        System.out.println("m4 method");
    }

    public static void main(String[] args) {
        /*Abs a = new Abs();
        a.m1();
        a.m2();
        a.m3();*/

        Abstract aa = new Abs();
        //Abs  aa = new Abstract();
        aa.m1();
        aa.m2();
        aa.m3();

        Abstract aaa = new Abs();
        Abs a = (Abs)aaa;
        // Child c1 = (Child) {it can be a parent variable} or {it can be a parent object like new Parent()};
        a.m4();





    }
}
