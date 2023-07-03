package Workout_final_OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public  class Admin extends User {
    String designation;
    Scanner in = new Scanner(System.in);

    /***
     *
     * @param id initializing id
     * @param name initializing name
     * @param dept initializing dept
     * @param designation initializing designation
     */
    public Admin(String id, String name, String dept, String designation) {
        super(id, name, dept);
        this.designation = designation;
    }

    /***
     *  Deleting the students
     * @param studentDetailsList holds the total student's rollNo who are writng exam
     * @param id to remove that particular student with that id
     */
    public void delete(ArrayList<String[]>studentDetailsList, String id){
        for (int i = 0; i < studentDetailsList.size(); i++) {
            if (studentDetailsList.get(i)[0].equals(id)) {
                studentDetailsList.remove(i);
                System.out.println("Student Removed successfully");
                break;
            }
        }
        System.out.println("The total no.of.students writing exam are: "+studentDetailsList.size());
    }

    /***
     * Updating the student's details w.r.t rollNo
     * @param studentDetailsList holds the total student's rollNo who are writng exam
     * @param id to remove that particular student with that id
     * @param update to update that particular student w.r.t the id
     */
    public void update(ArrayList<String[]>studentDetailsList,String id,String update){
        for (int i = 0; i < studentDetailsList.size(); i++) {
            if (studentDetailsList.get(i)[0].equals(id)){
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

    /***
     * adding students to the Studentslist
     * @param studentDetailsArray id and name of a student
     * @param studentDetailsList id and name of all student
     * @param no No.of.students to be added
     */
    public void addStudents(String[] studentDetailsArray, ArrayList<String[]>studentDetailsList,int no){
        for (int i = 0; i < no; i++) {
            System.out.println("Enter student's Id: ");
            String studId = in.nextLine();
            System.out.println("Enter student's name: ");
            String studName= in.nextLine();
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




}
