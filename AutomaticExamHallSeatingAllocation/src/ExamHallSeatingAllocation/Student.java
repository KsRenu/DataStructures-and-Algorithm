package ExamHallSeatingAllocation;

/**
 * this class is responsible for tracking student details.
 */
public class Student {
    private int rollNo;
    private String name;
    private String dept;
    private int year;
    private String category;
    private String examSession;

    /**
     * To create new student by initialising.
     * @param rollNo unique id of the student
     * @param name name of the student
     * @param dept department of the student
     */
    public Student(int rollNo, String name,String dept,int year, String category, String examSession){
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.year = year;// it can also be written as year = 3 if its a constant
        this.category = category;
        this.examSession = examSession;

    }

    //Not going to alter student's rollNo, name, dept,.

    /**
     * Used to update the student's year of studying
     * @param year of the student
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * Used to update the student's category
     * @param category of the student
     */
    public void setCategory(String category){
        this.category = category;
    }
    /**
     * Used to update the student's examSession
     * @param examSession exam Session for the student
     */
    public void setExamSession(String examSession){
        this.examSession = examSession;
    }

    /**
     *
     * @return roll number of the student
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return department of the student
     */
    public String getDept() {
        return dept;
    }

    /**
     *
     * @return year of the student
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @return category of the student
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @return examSession of the student
     */
    public String getExamSession() {
        return examSession;
    }
}
