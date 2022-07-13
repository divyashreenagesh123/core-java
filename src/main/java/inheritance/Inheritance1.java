package inheritance;

public class Inheritance1 implements CheckInterface{
    int a=1;
    int b=2;

    public Inheritance1(){
        System.out.println("parent class - 0 arg constructor");
    }
    {
        System.out.println("parent class instance block");
    }
    static {
        System.out.println("parent class static block");

    }

    static void add1(int i,int j){
        System.out.println("this is addition method");
        System.out.println("sum of i and j are"+ "  "+i+j);
    }
    int add2(){
        int a= 20;
        int b=10;
        System.out.println("add2 method in inheritance 1 class");
        System.out.println(a+b+"   "+"= addition method of a and b ");
        return a+b;
    }

    public static void main(String[] args) {
        add1(12,10);
        Inheritance1 t = new Inheritance1();
        t.add2();
        new Inheritance1();

    }

    @Override
    public void divide() {
        System.out.println("divide");
    }
}
