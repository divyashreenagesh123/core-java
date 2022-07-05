package method;

public class Methods2 {
    void m1(int a, char ch){
        System.out.println("m1 method");
        System.out.println(a);
        System.out.println(ch);
    }
    static void m2(String str, float f){
        System.out.println("m2 method");
        System.out.println(str);
        System.out.println(f);
    }

    public static void main(String[] args) {
        Methods2 m = new Methods2();
        m.m1(20,'d');
        Methods2.m2("understand method calling", 0.23f);
    }
}
