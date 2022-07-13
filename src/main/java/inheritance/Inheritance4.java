package inheritance;


public class Inheritance4 extends Inheritance3{

    static void maximum1(int i,int j){

        System.out.println("this is max method");
        if(i>j){
            System.out.println(i + "is the max of i and j");
        }
        else{
            System.out.println(j+ "j is the max of i and j");
        }

    }

    @Override
    int rem2() {
        int a= 12;
        int b =10;
        int remm= (a%b)+2;
        System.out.println("remm is "+ remm);
        return remm;

    }

    int maximum2(){
        int a= 20;
        int b=10;

        System.out.println("maximum2 method in inheritance 4 class");
        if(a>b){
            System.out.println(a + "a is max of a and b");
        }
        else{
            System.out.println(b+"b is max of a and b");
        }

       return a;
    }


    public static void main(String[] args) {
        //extracted();
        inhermethod4();
        inhermethod3();
        inhermethod2();
        Inheritance1 i1 = new Inheritance1();
        i1.add2();
        //Inheritance3 dgc = new Inheritance3();
    }

    private static void inhermethod2() {
        Inheritance2 i2 = new Inheritance2();
        i2.add2();
        i2.sub2();
    }

    private static void inhermethod3() {
        Inheritance3 i3 = new Inheritance3();
        i3.rem2();
        i3.add2();
        i3.sub2();
        //i3.maximum2();
    }

    private static void inhermethod4() {
        CheckInterface i4 = new Inheritance4();
      /*  i4.rem2();
        i4.add2();
        Inheritance3.rem1(12,12);
        i4.sub2();
        i4.maximum2();*/
        //i4.divide();
    }

    private static void extracted() {
        Math.max(12,10);
        Inheritance4 i4 = new Inheritance4 ();
        int something = i4.maximum2();
        System.out.println(something);
        Inheritance3 t1 = new Inheritance3();
        t1.rem2();
        Inheritance3.rem1(99,100);
    }



}

