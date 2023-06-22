package Workout_3_addingModules;

import java.util.ArrayList;

public class HallDetails {
    //private String id;
    private int hallCapacity = 36;
    private ArrayList<String[]> hallDetailsList = new ArrayList<>();

    private ArrayList<String[]> studentDetailsList;
    //public HallDetails(ArrayList<String[]> studentDetailsList,String id) {
      public HallDetails(ArrayList<String[]> studentDetailsList) {
        this.studentDetailsList = studentDetailsList;
        //this.id = id;
    }

    public ArrayList<String[]> hall(ArrayList<String[]> studentDetailsList) {
        ArrayList<Integer> hallNo = new ArrayList<>();
        hallNo.add(1);
        hallNo.add(2);
        hallNo.add(3);
        ArrayList<String[]> place = place(hallNo,studentDetailsList);
        return place;
    }
    int x,hallNum,benchpostion = 0;
    public ArrayList<String[]> place(ArrayList<Integer> hallNo,ArrayList<String[]> studentDetailsList){
        String[] position = new String[3];
        while(hallNum<hallNo.size()) {
            hallNum += 1;
            benchpostion=1;
            while (x < hallCapacity) {
                position = new String[]{String.valueOf(hallNum), String.valueOf(benchpostion),studentDetailsList.get(x)[0]};
                benchpostion+=1;
                hallDetailsList.add(position);
                x+=1;
            }
            hallCapacity+=36;
        }
        return hallDetailsList;
    }
}
