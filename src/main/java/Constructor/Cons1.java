package Constructor;
// Constructor : initializing constructor, types of constructor, instance and static variable and initializing values in constructor, calling constructor
// in object creation using  new key word the part where " new Test();" is called constructor

public class Cons1 {
    String s ;
    int k ;
    static int c = 99;
    int d = 10;

    void rule1(){
        System.out.println("RULE 1: CONSTRUCTOR AND CLASS NAME MUST BE SAME");
        System.out.println("constructors are able to take parameters");
        System.out.println("constructors ARE NOT ALLOWED TO TAKE RETURN TYPE");
        System.out.println("if there is no constructor in a class, then there is default constructor with 0 arguments");
        System.out.println("types: default and user defined constructor");
        System.out.println("create an object for every constructor in order to execute as you do in methods calling");
        System.out.println("compiler will generate an error if there is user defined constructor and creating an object of zero argument constructor as compiler will not generate default");

    }
    Cons1(){
        this(22,"divya");
        System.out.println("0 = argument constructor  thiskey word is used to call constructor");

    }
    Cons1(int k, String s){
        this(66);

        System.out.println("first constructor");
       System.out.println("ADVANTAGES: constructors are used to write the logics of application and it is executed while object creation");
       System.out.println("ADVANTAGE 2: constructors are used to initialize values to instance variables during object creation");
        System.out.println(k+s);
        s = "initialising the values to the instance variable";
        k= 33;
       System.out.println("values of instance variable" + s + " "+ k);
       System.out.println(this .s +" "+ this.k);
    }
    Cons1(int j){
        this(12,"divyaaaa",8);
        this.d = 50;
        c = 50;
        this.k = j;
       System.out.println(j+"second constructor with arguments");
       System.out.println(this .s +" "+ this.k);
    }
    Cons1(int k, String s, int g){
        this.k = k;
        this.s = s;
    }

    public static void main(String[] args) {
        System.out.println("example for default constructor");
        Cons1 c0 = new Cons1();
        Cons1 c = new Cons1(1, "s is songs");
        System.out.println("c " + c.k + " " + c.s+" " + Cons1.c+ " " + c.d);
        c.rule1();
        Cons1 c1 = new Cons1(2);
        System.out.println("c1 " + c1.k+ " " + c1.s+" " + Cons1.c+ " " + c1.d);
        Cons1 c2 = new Cons1(3, "a", 3);
        System.out.println("c2 " + c2.k+ " " + c2.s+" "+c2.d+ " "+ Cons1.c);
        Cons1 c3 = new Cons1(4, "b", 3);
        System.out.println("c3 " + c3.k+ " " + c3.s+" "+c2.d+ " "+ Cons1.c);





    }
}
