package instanceandStaticblck;

public class Instanceblock {

    int i = 100;
    int j = 200;
    {
        System.out.println(i+j+ "sum of" + i+ "and"+ j);
    }
    Instanceblock(){
        System.out.println("0 argument constructor");
    }
    public static void main(String[] args) {
        new Instanceblock();
        System.out.println("order of execution");
    }
}
