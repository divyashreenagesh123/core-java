package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryResources {

    static void theory1(){
        System.out.println("we can declare the resources in try block without catch block");
        System.out.println("we are required to close all the resources");

    }
    static void resource1(){
        System.out.println("declaring the resource in try block");
        System.out.println("scanner class resource automatically closes");
        System.out.println("if resource throws checked exception then catch block is mandatory");
        try(Scanner s = new Scanner(System.in)){
            System.out.println("enter a number");
            int number = s.nextInt();
            System.out.println("entered value is " + number);

        }
    }
    static void resources2() {
        System.out.println("we can v");
        try (FileInputStream fis = new FileInputStream("divya.java");Scanner s = new Scanner(System.in)) {
            System.out.println("rest of the application in try");
        }
        catch ( IOException e1){
            e1.printStackTrace();
        }
    }
    public static void main(String[] args) {
        theory1();
        resource1();
        resources2();
    }
}
