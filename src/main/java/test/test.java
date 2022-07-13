package test;

public class test {
    static int result;

    void m1(int a, int b){
        result = a+b;
    }

    public static void main(String[] args) {
        test t = new test();
        t.m1(1,2);
        System.out.println(result);
    }
}
