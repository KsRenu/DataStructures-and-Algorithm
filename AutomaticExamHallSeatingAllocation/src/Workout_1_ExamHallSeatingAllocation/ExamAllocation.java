package Workout_1_ExamHallSeatingAllocation;

import java.util.List;

/**
 * Many admin, many students and many subject codes so List used.
 */
public class ExamAllocation {
    private List<Admin> admins;
    private List<Student> students;
    private List<Subject> subjects;
    private  int hallNumber;
    private  int benchPosition;

    /**
     * new examAllocation object is created
     * @param admins list of admins in the exam cell
     * @param students list of students writing the exam
     * @param subjects list of subjects involved in the exam
     */
    public ExamAllocation(List<Admin> admins, List<Student> students, List<Subject> subjects) {
        this.admins = admins;
        this.students = students;
        this.subjects = subjects;
        hallNumber = 0;
        benchPosition = 0;
    }

    /**
     *
     * @return list of admins
     */
    public List<Admin> getAdmins() {
        return admins;
    }

    /**
     * adds a new admin to the admins list
     *
     * @param admin admin to be added.
     */
    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    /**
     *
     * @return list of students writing exam
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add a student to the exam
     * @param student student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**
     *
     * @return list of subjects involved in that exam
     */
    public List<Subject> getSubjects() {
        return subjects;
    }
    /**
     * add a subject to the exam
     * @param student subject to be added
     */
    public void addSubjects(Subject subject) {
        subjects.add(subject);
    }

    /**
     *
     * @return the hall number
     */
    public int getHallNumber() {
        return hallNumber;
    }

    /**
     * used to update the hall number
     * @param hallNumber to be updated
     */
    public  void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    /**
     *
     * @return last bench position allocated
     */
    public int getBenchPosition() {
        return benchPosition;
    }

    /**
     * used to update the bench position
     * @param benchPosition to be updated
     */
    public  void setBenchPosition(int benchPosition) {
        this.benchPosition = benchPosition;
    }
}
