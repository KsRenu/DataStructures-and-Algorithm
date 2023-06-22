package Workout_2_fullFunctionality;

import java.util.ArrayList;
import java.util.List;

public class doubt1 {
    public static void main(String[] args) {
        List<String[]> studentDetailsList = new ArrayList<>();
        List<String[]> adminDetailsList = new ArrayList<>();
        String[] studentDetailsArray = new String[4];
        String[] adminDetailsArray= new String[4];
        String[] arr2=new String[3];
        arr2[0]="Apple";
        arr2[1]="Banana";
        arr2[2]="Orange";
        System.out.println("Storing default values: ");
        adminDetailsArray[0] = "a0";
        adminDetailsArray[1] = "adminA0";
        adminDetailsArray[2] = "cse";
        adminDetailsArray[3] = "abc";
        studentDetailsArray[0] = "s0";
        studentDetailsArray[1] = "studA0";
        studentDetailsArray[2] = "it";
        studentDetailsArray[3] = "three";
        studentDetailsList.add(studentDetailsArray);
        adminDetailsList.add(adminDetailsArray);
        for (int i=0; i<1; i++){
            String[] tmp = studentDetailsList.get(i);
            for (int j=0; j<tmp.length; j++) {
                System.out.println(tmp[j]);
            }
        }
        System.out.println(studentDetailsList.get(0).toString() + " " + adminDetailsList);

    }
}
