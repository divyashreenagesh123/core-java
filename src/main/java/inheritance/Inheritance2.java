package inheritance;

public class Inheritance2 extends  Inheritance1{
    int a=10;
    int b=20;
    int c=3;
    int d=4;
    public Inheritance2(){

        System.out.println("child class const with 0 argu");

    }

    {
        System.out.println("child class instance block");
    }

    static {
        System.out.println("child class static block");

    }
    Inheritance2(int x, int y){
        super();
        //this(); CAN NOT CALL TWO CONSTRUCTORS AT A TIME
        System.out.println("1 argu child class constructor");
    }

        static void sub1(int i,int j){

            System.out.println("this is subtractionmethod");
            System.out.println("sub of i and j are"+ "  "+(i-j));
        }
        int sub2(){
            int a= 20;
            int b=10;
            System.out.println("sub2 method in inheritance 2 class");
            System.out.println((a-b)+"   "+"= subtraction method of a and b ");
            return a-b;
        }

        public static void main(String[] args) {
            //methodCreation();
            new Inheritance2(10,12);

        }


    private static void methodCreation() {
        int check = check();
        System.out.println("check = "+check);
        sub1(12,10);
        Inheritance2 t = new Inheritance2 ();
        t.sub2();


    }

    public static int check() {
            Inheritance4 i4 = new Inheritance4();
            int result = 5;
        System.out.println("Result" + result);
            return result;

    }
    }

