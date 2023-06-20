package ExamHallSeatingAllocation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Admin a1 = new Admin(1,"Ram","COE","CSE");
        Admin a2 = new Admin(2,"Ravi","A-COE","IT");

        List<Admin> adminList = new ArrayList<>();
        adminList.add(a1);
        adminList.add(a2);

        Student s1 = new Student(1,"s1","CSE",3,"UG","FN");
        Student s2 = new Student(2,"s2","IT",3,"UG","FN");
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        Subject sub1 = new Subject(123,"subject1");
        Subject sub2 = new Subject(456, "Subject2");
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(sub1);
        subjectList.add(sub2);

        ExamAllocation exam1 = new ExamAllocation(adminList,studentList,subjectList);
        ExamAllocation school = new ExamAllocation(adminList,studentList,subjectList);
        exam1.setHallNumber(45);
        exam1.setBenchPosition(11);
        Admin a3 = new Admin(3,"Rekha","A-COE","IT");
        exam1.addAdmin(a3);
        //exam1.addAdmin(Admin a3);
        System.out.println("The admin are: "+ exam1.getAdmins());
        System.out.println("The hall number is: "+ exam1.getHallNumber());
        System.out.println("The bench position is: "+exam1.getBenchPosition());

    }
}
