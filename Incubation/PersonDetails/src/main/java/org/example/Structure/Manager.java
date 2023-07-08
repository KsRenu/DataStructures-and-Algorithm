package org.example.Structure;


public class Manager extends Person{
    private String[] reportingTeam = new String[5];
    private String dept;


    public Manager(int id, String fname, String lname,int age,String type, double amount, String[] reportingTeam, String dept) {
        super(id, fname, lname, age,type, amount);
        this.reportingTeam = reportingTeam;
        this.dept = dept;
    }

    public String getReportingTeam() {
        return reportingTeam.toString();
    }

    public void setReportingTeam(String[] reportingTeam) {
        this.reportingTeam = reportingTeam;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String toString() {
        return "fname: "+ getFname()+ "\nlname: " + getLname()+ "\nAge: " + getAge()+"\nAmt: " + getAmount()+ "\ntype: " + getType()+"\nRepoting team members: "+ getReportingTeam() + "\ndept: " + dept ;
    }
}
