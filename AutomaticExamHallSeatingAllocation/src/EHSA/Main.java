package EHSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("You're Admin or Student: a/s");
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        System.out.println("Enter your Id: ");
        int id = in.nextInt();
        System.out.println("Enter your name: ");
        String name= in.nextLine();
        in.nextLine();
        System.out.println("Enter your department: ");
        String dept = in.nextLine();

        if(user.equals("a")){
            System.out.println("Enter your designation: ");
            String designation = in.nextLine();
            Admin a1 = new Admin(id,name,dept,designation);
            //a1.display();
            System.out.println("Action to be performed: ");
            System.out.println("1. Retrieve data\n2.Insert student detail\n.3.Update student detail\n4.Delete a student");
            int action = in.nextInt();
            if(action==1){
                System.out.println("Do you cant to retrieve all data or particular student");
                System.out.println("1.All data\n2.Particular student");
                int data = in.nextInt();
                if(data==1){
                    System.out.println("Details: ");
                    a1.display();

                }
                else {
                    System.out.println("Enter the id of the student: ");
                }

            }
            else if (action==2) {
                System.out.println("How many students you want to add: ");
                int no = in.nextInt();

            }
            else if (action == 3) {
                System.out.println("Updating data");
            }
            else if (action==4) {
                System.out.println("Deleting data");

            }else{
                System.out.println("Enter the numbers from 1 to 4 .");
            }

        }




        else if (user.equals("s")) {
            System.out.println("Enter your year: ");
            int yr = in.nextInt();
            Student s1 = new Student(id,name,dept,yr);
            //s1.display();


        }



        else{
            System.out.println(" Only admins and students can access the portal");
        }


        HallDetails h = new HallDetails();
        ArrayList<Integer> x = h.hall();
        System.out.println(x);





    }
}
