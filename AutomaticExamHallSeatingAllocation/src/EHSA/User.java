package EHSA;

interface show{
    public default void display() {}
}
public class User implements show{
    private String id;
    private String name ;
    public String dept;

    public User(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    public void display(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Dept: "+this.dept);
    }





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
