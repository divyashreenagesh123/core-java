package method;

// example for using local and instance variables with same name

import model.Companies;
import model.Employee;
import model.Institutions;
import model.Student;

public class Methods4 {
    int j= 20;
    int k=22;

    void m70(Companies cmp, Employee emp, int j, int k) {
        System.out.println("m1 method");
        System.out.println(cmp );
        System.out.println(emp);
        System.out.println(j+k);
        System.out.println(this.j+this.k);
    }

    static void m2(Institutions inst, Student stud) {
        System.out.println("m2 method");
        System.out.println(inst);
        System.out.println(stud);

    }

    public static void main(String[] args) {
        Methods4 m = new Methods4();
        Companies cmp = new Companies("venus", "vijaynagar", "Divya", 121);
        Employee emp = new Employee("Emily", 334, "Accounts", 79000);
        Institutions inst = new Institutions("DD", 10, 5000);
        Student stud = new Student("darshan", 12231, 250, 'c');
        m.m70(cmp, emp, 22, 66);
        Methods3.m2(inst,stud);

    }
    }


