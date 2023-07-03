package Workout_final_OOPS;

import java.util.ArrayList;

interface show{
    public void display(String id, String name, String dept);
    public  void display(ArrayList<String[]> studentDetailsList, String id);
}

public  class User implements show{
    private String id;
    private String name ;
    public String dept;
    private String value;

    public User(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.value = value;
    }

    /***
     * Collecting and Printing the current user details
     * @param id Id of the user
     * @param name Name of the user
     * @param dept department of the user.
     */
    public void display(String id, String name, String dept){
        System.out.println("Accessing user details: " +
                " Id: "+id+
                " Name: "+ name+
                " Dept: "+ dept);
    }

    @Override
    public  void display(ArrayList<String[]> studentDetailsList, String id) {
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
