package org.example.Structure;


public class Employee extends Person{
    private String role;
    private String dept;

    public Employee(int id, String fname, String lname, int age,String type, double amount, String role, String dept) {
        super(id, fname, lname, age,type, amount);
        this.role = role;
        this.dept = dept;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String toString() {
        return "fname: "+ getFname()+ "\nlname: " + getLname()+ "\nAge: " + getAge()+"\nAmt: " + getAmount()+ "\ntype: " + getType()+"\nrole: "+ role + "\ndept: " + dept ;
    }
}
