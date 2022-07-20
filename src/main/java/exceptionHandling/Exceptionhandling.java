package exceptionHandling;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Exceptionhandling {
     void types(){
         System.out.println();
         System.out.println("Exception types:\nchecked\nunchecked\nerror");
         System.out.println("throwable exception is the parent of all exception");
         System.out.println("runtime and error are unchecked exceptions");
     }
     static void checkedExceptionExample(){
         System.out.println("checked exceptions are child of exception class");
         System.out.println("1.Interrupted Exception");
        // Thread.sleep(10000);
         System.out.println("2.File Not Found Exception");
         //FileInputStream fis = new FileInputStream("divya.java");
         System.out.println("NOTE: compiler just provides the information, all exceptions are raised at the runtime");
         int[] a = new int[10000000];
     }
     static void errorExceptionExample(){
         //int[] a = new int[1000000000000];
         System.out.println("error occurs due to the lack of system resources");
         System.out.println("out of memory error");
     }

    public static void main(String[] args) {
        uncheckedExceptionExample();
        checkedExceptionExample();
        errorExceptionExample();

    }


    private static void uncheckedExceptionExample() {
        //Exceptionhandling t = new Exceptionhandling();
        System.out.println("unchecked exceptions are child of runtime exceptions and below are the examples of unchecked exceptions");

        int[] a = {1,2,3,4};
        Integer i = Integer.valueOf("ten"); // NumberFormatException
        System.out.println(i);


        System.out.println(a[4]); // .ArrayIndexOutOfBoundsException
        System.out.println(10/0 +"exceptions unchecked by compiler and chcecked by runtime these exceptions are called unchecked exceptions");
        System.out.println("DIVYADARSHAN".charAt(13)); // .StringIndexOutOfBoundsException
    }
}
