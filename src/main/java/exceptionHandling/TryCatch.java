package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {


    static void theory(){
        System.out.println("Exception can be handled by \ntry catch method \n throws" );

    }
    private static void example1() {
        System.out.println("1.below is the example of an arithmetic exception ");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println(10/2);
        }
        System.out.println("2.");
    }
    static void example2(){
        System.out.println("2. below is the example of an try catch block with pipe symbol ");
        System.out.println("while using the pipe symbol make sure the checked exception is handled or mentioned in the catch block ");
        System.out.println("using pipe symbol we can have mixed exceptions i.e checked and unchecked");
        System.out.println("using pipe symbol we can not mix both child and parent exceptions");
        try{
            Thread.sleep(10000);
            FileInputStream fi = new FileInputStream("divya.java");
        }
        catch (InterruptedException | FileNotFoundException er){
            System.out.println(er.getMessage());
        }
    }

    static void example3(){

        System.out.println("3. multiple catch blocks with different types of getting messages");
        try{
            int[] a = {1,2,3,4};
            Integer i = Integer.valueOf("ten");
            Scanner s = new Scanner(System.in);
            System.out.println("enter a number");
            int num = s.nextInt();
            System.out.println(10/num);
            System.out.println("divya".charAt(3));
        }
        catch (NumberFormatException er){
            er.printStackTrace();
        }
        catch (StringIndexOutOfBoundsException er4){
            System.out.println(er4);
        }
        catch (Error er2){
            System.out.println(er2.getMessage());
        }
        catch (Exception er3){
            System.out.println(er3.getMessage());
        }
        System.out.println("rest of the application");

    }



    private static void example4() {
        System.out.println("JVM by default prints the exception if the exception is not handled and below is the example ");
        System.out.println(10/0);
    }


    public static void main(String[] args) {
        //example1();
        example2();
        //example3();
        //example4();
    }
}
