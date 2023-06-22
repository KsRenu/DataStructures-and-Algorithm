package EHSA;

public class Student extends User{
    private String yr;

    public Student(String id, String name, String dept, String yr) {
        super(id, name, dept);
        this.yr = yr;
    }
    public void display(){
        super.display();
        System.out.println("The year of the student are: "+this.yr);

    }

    public String getYr() {
        return yr;
    }

    public void setYr(String yr) {
        this.yr = yr;
    }
}

