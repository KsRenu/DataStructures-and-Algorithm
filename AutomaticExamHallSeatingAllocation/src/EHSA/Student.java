package EHSA;

public class Student extends User{
    private int yr;

    public Student(int id, String name, String dept, int yr) {
        super(id, name, dept);
        this.yr = yr;
    }
    public void display(){
        super.display();
        System.out.println("The year of the student are: "+this.yr);

    }

    public int getYr() {
        return yr;
    }

    public void setYr(int yr) {
        this.yr = yr;
    }
}

