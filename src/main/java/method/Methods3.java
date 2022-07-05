package method;

// example for methods accepting objects as arguments

import model.Companies;
import model.Employee;
import model.Institutions;
import model.Student;

public class Methods3 {

    void m1(Companies cmp, Employee emp) {
        System.out.println("m1 method");
        System.out.println(cmp );
        System.out.println(emp);
    }

    static void m2(Institutions inst, Student stud) {
        System.out.println("m2 method");
        System.out.println(inst);
        System.out.println(stud);
    }

    public static void main(String[] args) {
        Methods3 m = new Methods3();
        Companies cmp = new Companies("venus", "vijaynagar", "Divya", 121);
        Employee emp = new Employee("Emily", 334, "Accounts", 79000);
        Institutions inst = new Institutions("DD", 10, 5000);
        Student stud = new Student("darshan", 12231, 250, 'c');
        m.m1(cmp, emp);
        Methods3.m2(inst,stud);

    }
}
