package model;

public class Employee {
    private String empName;
    private Integer empId;
    public String Department;
    private Integer empSalary;

    public Employee(String empName, Integer empId, String department, Integer empSalary) {
        this.empName = empName;
        this.empId = empId;
        Department = department;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", Department='" + Department + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }
}
