package abs;

abstract class Abstract3 {
    {
        System.out.println("instance block");
    }
    static{
        System.out.println("static block");
    }
    Abstract3(){
        System.out.println("inside abstract class constructor can be declared");
    }
    /*public static void main(String[] args) {

        System.out.println("abstract class can have main method i.e psvm");
    }*/
}

class Abs5 extends Abstract3 {
    Abs5(){
        super();
        System.out.println("child class constructor");
    }
    public static void main(String[] args) {
        Abstract3 aa = new Abs5();
        System.out.println("abstract class can have main method i.e psvm");
    }
}
