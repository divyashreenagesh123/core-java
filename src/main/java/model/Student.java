package model;

public class Student {
    public String Name;
    public Integer StudentId;
    public Integer finalMarks;
    public Character studentGrade;

    public Student(String name, Integer studentId, Integer finalMarks, Character studentGrade) {
        Name = name;
        StudentId = studentId;
        this.finalMarks = finalMarks;
        this.studentGrade = studentGrade;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", StudentId=" + StudentId +
                ", finalMarks=" + finalMarks +
                ", studentGrade=" + studentGrade +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Integer getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(Integer finalMarks) {
        this.finalMarks = finalMarks;
    }

    public Character getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(Character studentGrade) {
        this.studentGrade = studentGrade;
    }
}
