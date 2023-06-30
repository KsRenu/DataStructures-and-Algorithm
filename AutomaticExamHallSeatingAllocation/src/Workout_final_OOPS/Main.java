package Workout_final_OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String[]> studentDetailsList = new ArrayList<>();
        ArrayList<String[]> adminDetailsList = new ArrayList<>();
        String studentDetailsArray[] = new String[4];
        String adminDetailsArray[] =  new String[4];
        System.out.println("Storing 10 default admin and 108 student values: ");
        String defaultId,defaultName;
        for (int i = 0; i < 10; i++) {
            defaultId = "s"+i;
            defaultName = "studS"+i;
            studentDetailsArray= new String[]{defaultId,defaultName, "it", "three"};
            defaultId = "a"+i;
            defaultName = "adminA"+i;
            adminDetailsArray= new String[]{defaultId,defaultName, "cse", "abc"};
            studentDetailsList.add(studentDetailsArray);
            adminDetailsList.add(adminDetailsArray);
        }
        for (int i = 10; i < 108; i++) {
            defaultId = "s"+i;
            defaultName = "studS"+i;
            studentDetailsArray= new String[]{defaultId,defaultName, "it", "three"};
            studentDetailsList.add(studentDetailsArray);
        }

        System.out.println("You're Admin or Student: a/s");
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        System.out.println("Enter your Id: ");
        String id = in.nextLine();
        System.out.println("Enter your name: ");
        String name= in.nextLine();
        System.out.println("Enter your department: ");
        String dept = in.nextLine();
        User u = new User(id,name,dept);

        if(user.equals("a")){
            System.out.println("Enter your designation: ");
            String designation = in.nextLine();
            u.display(id,name,dept);
            Admin u1 = new Admin(id,name,dept, designation);
            System.out.println("Action to be performed: ");
            System.out.println("1. Retrieve students data\n" +
                    "2.Insert student detail\n" +
                    "3.Update student detail\n" +
                    "4.Delete a student");
            int action = in.nextInt();
            if(action==1){
                System.out.println("1.Retrieving details");
                //int data = in.nextInt();
                //if(data==1) {
                    System.out.println("Details: ");
                    Student.display(studentDetailsList);
                //}
            }
            else if (action==2) {
                System.out.println("How many students you want to add: ");
                int no = in.nextInt();
                u1.addStudents(studentDetailsArray,studentDetailsList,no);
            }
            else if (action == 3) {
                System.out.println("Updating data");
                System.out.println("What detail you want to update: name/dept/yr");
                in.nextLine();
                String update = in.nextLine();
                System.out.println("Enter student's Id: ");
                String studId = in.nextLine();
                u1.update(studentDetailsList,studId,update);
            }
            else if (action==4) {
                System.out.println("Deleting data");
                System.out.println("Enter student's Id: ");
                in.nextLine();
                String studId = in.nextLine();
                u1.delete(studentDetailsList,studId);
            } else{
                System.out.println("Enter the numbers from 1 to 4 .");
            }
        }
        else if (user.equals("s")) {
            System.out.println("Enter your year: ");
            String yr = in.nextLine();
            u.display(id,name,dept);
            Student u1 = new Student(id,name,dept,yr);
            u1.display(studentDetailsList,id);
        }
        else{
            System.out.println(" Only admins and students can access the portal");
        }
    }
}
