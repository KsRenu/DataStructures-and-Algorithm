package ExamHallSeatingAllocation;

/**
 * This class is resposible for tracking the admin details
 */
public class Admin {
    private int adminId;
    private String name;
    private String designation;
    private String dept;

    /**
     * This constructor creates new teacher object.
     * @param adminId Id for the teacher
     * @param name Name of the teacher
     * @param designation designation of the teacher
     * @param dept department of the teacher
     */
    public Admin(int adminId, String name, String designation, String dept){
        this.adminId = adminId;
        this.name = name;
        this.designation =  designation;
        this.dept = dept;
    }

    /**
     *
     * @return  the adminId
     */
    public int getAdminId(){
        return adminId;
    }

    /**
     *
     * @return  the name of the admin
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the designation of the admin
     */
    public String getDesignation(){
        return designation;
    }

    /**
     *
     * @return the dept of the admin
     */
    public String getDept(){
        return dept;
    }

    /**
     * set the designation of the admin
     * @param designation  of the admin
     */
    public void setDesignationt(String designation){
        this.designation = designation;
    }

}
