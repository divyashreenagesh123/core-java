package inheritance;
//Cannot inherit from final 'inheritance.Inheritance2' if class is declared final
public class Inheritance3 extends Inheritance2{
    int a=100;
    int b=200;
    int e=5;
    int f=6;
    static void rem1(int i,int j){

        System.out.println("this is reminder method");
        System.out.println("reminder of i and j are"+ "  "+(i%j));
    }
    int rem2(){
        int a= 20;
        int b=10;
        System.out.println("rem2 method in inheritance 2 class");
        System.out.println((a%b)+"   "+"= reminder method of a and b ");
        return a%b;
    }
    void variables(int k, int n){
        System.out.println("k+n is "+ (k+n) );
        System.out.println("e+f is "+ (e+f) );
        System.out.println("c+d is "+ (c+d) );
    }
    void variables2(int a, int b){
        System.out.println("a+b local is "+ (a+b) );
        System.out.println("a+b this is "+ (this.a+this.b) );
        System.out.println("a+b super is "+ (super.a+super.b) );
    }

    public static void main(String[] args) {

        //rem1(12,10);
        Inheritance3 t = new Inheritance3 ();
        //t.rem2();
        t.variables(1,2);
        t.variables2(1,2);

    }
}
