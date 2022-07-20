package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyInTryCatch {
    void theory(){
        System.out.println("1.finally block executes always irrespective of try-catch");
        System.out.println("2.finally block closes all the resources");
    }
    void practical_1() {
        try {
            System.out.println("try block");

        } catch (ArithmeticException ae) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block executes if exception doesn't match well");
        }
    }
    void practical_2(){
        try{
            Scanner s = new Scanner(System.in);
                System.out.println("enter a number");
                int number = s.nextInt();
                System.out.println("entered value is " + number);
        }
        catch (InputMismatchException ne){
            System.out.println(10/0);
            System.out.println("catchblock");
        }
        finally {
            System.out.println("exception inside catch block after catching exception in try block.even if exception matches or not, finally block will execute");
        }

    }
    void practical_3(){
        try{
            System.out.println("try block" + (10/0));
        }
        catch (ArithmeticException e){
            System.out.println("CATCH BLOCK");
            System.out.println("when finally block has exceptions , finally block executes but abnormal execution");
        }
        finally {
            System.out.println(10/0);
        }
    }
    void practical_4(){
        try{
            System.out.println("try block with finally block");
        }
        finally {
            System.out.println("finally and try block");
        }
    }
    void practical_5(){
        System.out.println("there are two cases where FINALLY BLOCK IS NOT EXECUTED ............... case 1: when there is exception before try block and 2nd: when there is system.exit code is executed ");
        System.out.println(10/0);
        try{
            System.out.println("try block with finally block");
            System.exit(0);
        }
        finally {
            System.out.println("finally and try block");
        }
    }
    void practical_6(){
        System.out.println("when there is exception raised in try and in catch and in finally the jvm will display finally block exception as that is most recent");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException aee){
            System.out.println("catch block");

        }
        finally {
            int[]a = {1,2,3,4};
            System.out.println(a[8]);
        }
    }
    int practical_7(){
        try{
            return 10;
        }
        catch (ArithmeticException ee){
            return 20;
        }
        finally {
            return 30;
        }
    }

    public static void main(String[] args) {
        new FinallyInTryCatch().theory();
        new FinallyInTryCatch().practical_1();
        //new FinallyInTryCatch().practical_2();
        FinallyInTryCatch ft = new FinallyInTryCatch();
        //ft.practical_3();
        //ft.practical_4();
        //ft.practical_5();
        //ft.practical_6();
        int x= ft.practical_7();
        System.out.println(x);
    }

}
