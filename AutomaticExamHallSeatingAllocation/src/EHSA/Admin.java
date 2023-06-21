package EHSA;

public class Admin extends User{
    String designation;

    public Admin(int id, String name, String dept, String designation) {
        super(id, name, dept);
        this.designation = designation;
    }
    public void display(){
        super.display();
        System.out.println("Designation: "+this.designation);
    }
}
