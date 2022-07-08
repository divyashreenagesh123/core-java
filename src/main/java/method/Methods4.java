package method;

// example for using local and instance variables with same name and one method with int return type

import model.Companies;
import model.Employee;
import model.Institutions;
import model.Student;

public class Methods4 {
    int j= 20;
    int k=22;

    Employee m70(Companies cmp, Employee emp, int j, int k) {
        System.out.println("m1 method");
        System.out.println(cmp );
        System.out.println(emp);
        System.out.println(j+k);
        System.out.println(this.j+this.k);
        return emp;
    }
    Methods4 m111(){
        System.out.println("testing 111 and returning using this keyword for same class object ");
        Methods4 m11 = new Methods4();
        //return m11;
        return this;

    }
    int m99(){
        System.out.println("printing the method of return type int");
        return 990;

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
        Employee e1 = m.m70(cmp,emp,12,11);
        Methods3.m2(inst,stud);
        int x = m.m99();
        System.out.println(x);
        m.m111();


    }
    }


