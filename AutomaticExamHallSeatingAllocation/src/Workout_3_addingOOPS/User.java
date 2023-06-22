package Workout_3_addingOOPS;

import java.util.ArrayList;


public class User {
    private String id;
    private String name ;
    public String dept;
    private String value;
    //private ArrayList<String[]>studentDetailsList;

    public User(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.value = value;
        //this.studentDetailsList = studentDetailsList;
    }
    public void display(String id, String name, String dept){
        System.out.println("Accessing user details: " +
                " Id: "+id+
                " Name: "+ name+
                " Dept: "+ dept);
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
