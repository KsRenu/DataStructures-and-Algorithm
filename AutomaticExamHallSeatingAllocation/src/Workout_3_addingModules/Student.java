package Workout_3_addingModules;

import java.util.ArrayList;

public class Student extends User {
    private String yr;


    public Student(String id, String name, String dept, String yr) {
        super(id, name, dept);
        this.yr = yr;
    }
    public void display(ArrayList<String[]> studentDetailsList,String id){
        HallDetails h = new HallDetails(studentDetailsList);
        ArrayList<String[]> hall = h.hall(studentDetailsList);
        for (int i = 0; i < hall.size(); i++) {
            if(hall.get(i)[2].equals(id)){
                System.out.println("The position of "+hall.get(i)[2] +" is at : Hall: "+ hall.get(i)[0]+ " benchPosition: "+hall.get(i)[1]);
            }
        }

    }

    public String getYr() {
        return yr;
    }

    public void setYr(String yr) {
        this.yr = yr;
    }
}

