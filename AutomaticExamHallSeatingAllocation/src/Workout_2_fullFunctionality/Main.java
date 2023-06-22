package Workout_2_fullFunctionality;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin a0 = new Admin("a0","adminA0","cse","abc");
        Student s0 = new Student("s0","studA0","it","three");
        ArrayList<String[]> studentDetailsList = new ArrayList<>();
        ArrayList<String[]> adminDetailsList = new ArrayList<>();
        String studentDetailsArray[];
        String adminDetailsArray[];
        System.out.println("Storing 10 default student and admin values: ");
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
        //in.nextLine();
        System.out.println("Enter your department: ");
        String dept = in.nextLine();

        if(user.equals("a")){
            System.out.println("Enter your designation: ");
            String designation = in.nextLine();
            Admin a1 = new Admin(id,name,dept,designation);
            //a1.display();
            System.out.println("Action to be performed: ");
            System.out.println("1. Retrieve students data\n2.Insert student detail\n.3.Update student detail\n4.Delete a student\n5.Get Hall Detail");
            int action = in.nextInt();


            if(action==1){
                System.out.println("Do you cant to retrieve all data or particular student");
                System.out.println("1.All data\n2.Particular student");
                int data = in.nextInt();
                if(data==1){
                    System.out.println("Details: ");
                    a0.display();
                    for (int i = 0; i < studentDetailsList.size(); i++) {

                            System.out.println("Id: "+studentDetailsList.get(i)[0]+" name: "+
                                    studentDetailsList.get(i)[1]+ " dept: "+studentDetailsList.get(i)[2]+
                                    " yr: "+ studentDetailsList.get(i)[3]);


                    }
                    System.out.println("The total no.of.students writing exam are: "+studentDetailsList.size());



                }
                else {
                    System.out.println("Enter the id of the student: ");
                    System.out.println(studentDetailsList.get(0)[0]);
                    in.nextLine();
                    String studId = in.nextLine();
                    for (int x = 0; x < studentDetailsList.size(); x++) {

                        if (studentDetailsList.get(x)[0].equals(studId)){
                            System.out.println("Id: "+studentDetailsList.get(x)[0]+" name: "+
                                    studentDetailsList.get(x)[1]+ " dept: "+studentDetailsList.get(x)[2]+
                                    " yr: "+ studentDetailsList.get(x)[3]);
                            break;

                        }


                    }


                }

            }



            else if (action==2) {
                System.out.println("How many students you want to add: ");
                int no = in.nextInt();
                for (int i = 0; i < no; i++) {
                    System.out.println("Enter student's Id: ");
                    String studId = in.nextLine();
                    //in.nextLine();
                    System.out.println("Enter student's name: ");
                    String studName= in.nextLine();
                    //in.nextLine();
                    System.out.println("Enter student's department: ");
                    String studDept = in.nextLine();
                    System.out.println("Enter student's year: ");
                    String studYr = in.nextLine();
                    studentDetailsArray = new String[]{studId, studName, studDept, studYr};
                    studentDetailsList.add(studentDetailsArray);


                }
                System.out.println("The total no.of.students writing exam are: "+studentDetailsList.size());
                System.out.println("Student added to the list successfully");

            }
            else if (action == 3) {
                System.out.println("Updating data");
                System.out.println("What detail you want to update: name/dept/yr");
                String update = in.nextLine();
                System.out.println("Enter student's Id: ");
                String studId = in.nextLine();
                in.nextLine();
                //make it proper
                for (int i = 0; i < studentDetailsList.size(); i++) {
                    if (studentDetailsList.get(i)[0].equals(studId)){
                        if(update.equals("name")) {
                            System.out.println("Enter student's name: ");
                            String studName = in.nextLine();
                            studentDetailsList.get(i)[1]=studName;
                            break;
                        } else if (update.equals("dept")) {
                            System.out.println("Enter student's department: ");
                            String studDept = in.nextLine();
                            studentDetailsList.get(i)[2]=studDept;
                            break;

                        } else if (update.equals("yr")) {
                            System.out.println("Enter student's year: ");
                            String studYr = in.nextLine();
                            studentDetailsList.get(i)[3]=studYr;
                            break;
                        }else{
                            System.out.println("Enter the correct option by trying again.");
                            break;
                        }

                    }

                }



            }
            else if (action==4) {
                System.out.println("Deleting data");
                System.out.println("Enter student's Id: ");
                in.nextLine();
                String studId = in.nextLine();

                //make it proper
                for (int i = 0; i < studentDetailsList.size(); i++) {
                    if (studentDetailsList.get(i)[0].equals(studId)) {
                        studentDetailsList.remove(i);
                        System.out.println("Student Removed successfully");
                        break;
                    }

                    }
                System.out.println("The total no.of.students writing exam are: "+studentDetailsList.size());

            } else if (action==5) {
                HallDetails h = new HallDetails(studentDetailsList);
                ArrayList<String[]> hall = h.hall(studentDetailsList);
                for (int i = 0; i < hall.size(); i++) {
                    //for (int j = 0; j < 3; j++) {

                        System.out.println("Hall: "+ hall.get(i)[0]+ " becnchPosition: "+hall.get(i)[1]+" id: "+hall.get(i)[2]);

                    //}
                }


            } else{
                System.out.println("Enter the numbers from 1 to 4 .");
            }

        }




        else if (user.equals("s")) {
            System.out.println("Enter your year: ");
            String yr = in.nextLine();
            Student s1 = new Student(id,name,dept,yr);
            //s1.display();
            System.out.println("your position is at: ");
            HallDetails h = new HallDetails(studentDetailsList);
            ArrayList<String[]> hall = h.hall(studentDetailsList);
            for (int i = 0; i < hall.size(); i++) {
                //for (int j = 0; j < 3; j++) {
                    if(hall.get(i)[2].equals(id)){
                        System.out.println("Your position is: Hall: "+ hall.get(i)[0]+ " becnchPosition: "+hall.get(i)[1]);
                    }
                //}
            }



        }



        else{
            System.out.println(" Only admins and students can access the portal");
        }








    }
}
