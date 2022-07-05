// example for using local and instance variables with same name
    class Test1{}
    class Emp1{}
    class Y1{}
    class Student1{}
    public class Methods4 {
    int j= 20;
    int k=22;

        void m1(Test1 t, Emp1 e, int j, int k) {
            System.out.println("method 1 accepting t and e objects of class test and emp");
            System.out.println(j+k);
            System.out.println(this.j+this.k);
        }

        static void m2(Y1 y, Student1 stud) {
            System.out.println("method 2 accepting y and stud objects of class Y and Student");
        }

        public static void main(String[] args) {
            Methods4 m = new Methods4();
            m.m1(new Test1(), new Emp1(),30,44);
            Methods4.m2(new Y1(),new Student1());
        }
    }


