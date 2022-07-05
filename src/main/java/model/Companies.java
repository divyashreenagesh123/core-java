package model;

public class Companies {
    private String companyName;
    private String companyAddress;
    private String Owner;
    private Integer numberOfEmployees;


    public Companies(String companyName, String companyAddress, String owner, Integer numberOfEmployees) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        Owner = owner;
        this.numberOfEmployees = numberOfEmployees;
    }

    public Companies() {

    }

    @Override
    public String toString() {
        return "Companies{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", Owner='" + Owner + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }




}
