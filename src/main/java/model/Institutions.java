package model;

public class Institutions {

    public String nameOfTheInstitution;
    public Integer numberOfDepartments;
    private Integer numberOfStaffs;

    public Institutions(String nameOfTheInstitution, Integer numberOfDepartments, Integer numberOfStaffs) {
        this.nameOfTheInstitution = nameOfTheInstitution;
        this.numberOfDepartments = numberOfDepartments;
        this.numberOfStaffs = numberOfStaffs;
    }


    @Override
    public String toString() {
        return "Institutions{" +
                "nameOfTheInstitution='" + nameOfTheInstitution + '\'' +
                ", numberOfDepartments=" + numberOfDepartments +
                ", numberOfStaffs=" + numberOfStaffs +
                '}';
    }

    public String getNameOfTheInstitution() {
        return nameOfTheInstitution;
    }

    public void setNameOfTheInstitution(String nameOfTheInstitution) {
        this.nameOfTheInstitution = nameOfTheInstitution;
    }

    public Integer getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(Integer numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public Integer getNumberOfStaffs() {
        return numberOfStaffs;
    }

    public void setNumberOfStaffs(Integer numberOfStaffs) {
        this.numberOfStaffs = numberOfStaffs;
    }
}
