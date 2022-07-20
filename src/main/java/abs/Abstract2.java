package abs;



abstract class Abstract2  {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class Abs2 extends Abstract2{
    @Override // one need not implement all the abstract methods, we can implement one and declare the class as abstract class
    // similarly one can implement methods in different classses and declare the class as abstract class
    void m1() {
        System.out.println("m1 method");
    }
}
abstract class Abs3 extends Abs2{
    void m2(){
        System.out.println("m2 method");
    }
}
abstract class Abs4 extends Abs3{
    void m3(){
        System.out.println("m3 method");
        System.out.println("// one need not implement all the abstract methods, we can implement one and declare the class as abstract class\n" +
                "    // similarly one can implement methods in different classes and declare the class as abstract class");
    }


// we can implement all the methods in an abstract class
    /*public static void main(String[] args) {
        Abstract2 a2 = new Abs4();
        a2.m1();
        a2.m2();
        a2.m3();

    }*/
}
class Abs41 extends Abs4 {
    public static void main(String[] args) {
        Abstract2 a2 = new Abs41();
        a2.m1();
        a2.m2();
        a2.m3();
    }
}