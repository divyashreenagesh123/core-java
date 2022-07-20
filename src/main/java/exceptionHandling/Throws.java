package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
    void theory(){
        System.out.println("exception handling using throws keyword");
        System.out.println("when method do not handle exception it uses keyword called THROWS so that the exception can be handled by other method");
    }
    void studtls() throws ArithmeticException,FileNotFoundException {
        System.out.println("particular student is disciplined ");
       //System.out.println(10 / 0);
        FileInputStream fs = new FileInputStream("divya.java");
    }
        /*try{
            System.out.println(10/0);
        }
        catch (ArithmeticException  ie){
            System.out.println("student is sleeping");
        }*/
        //>>>>>>>  try & catch block is one of the method to handle exceptions below gives an example of throws

    void hod() throws FileNotFoundException{
        try{
           studtls();
            System.out.println("inside try-catch of HOD");

        }
        catch ( ArithmeticException  afe){
            System.out.println("student is sleeping");
            afe.getMessage();
        }
    }
    void principal() {
        try{
            hod();
            System.out.println("principal method");

        }
        catch (FileNotFoundException fe){
            fe.getMessage();
            System.out.println(fe.getMessage());
            //fe.printStackTrace();
        }

    }
    void college() {
        principal();
    }

    public static void main(String[] args)  {
        System.out.println("Throws example: assuming we need a particular student information>> we contact the  college and then to the principal and then with the hod and then we would get the information of that particular student");
        System.out.println("checked exceptions are propagated by THROWS keyword but Unchecked are automatically propagated");
        Throws t = new Throws();
        t.theory();
        System.out.println("if no method handles exception and if it is delegate to main method, JVM will handle the EXCEPTION");
        t.college();
        System.out.println(" the end");

    }
}
