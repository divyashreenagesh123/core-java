public class Methods {
    int i=10;
    int j = 20;
    static void m1(){
        System.out.println("first method");

    }
    void m2(){
        System.out.println("m2 method");
        m1();
    }

    public static void main(String[] args) {
        Methods t = new Methods();
        Methods.m1();
        System.out.println("called m1");
        t.m2();
        System.out.println("called m2");

    }

}
