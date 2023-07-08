package org.example.Structure;

public class Intern extends Person{
    private String startDate;
    private String endDate;
    public Intern(int id, String fname, String lname, int age,String type, double amount,String startDate, String endDate ) {
        super(id, fname, lname, age,type, amount);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
