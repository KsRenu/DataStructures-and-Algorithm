package ExamHallSeatingAllocation;

/**
 * this class is used for tracking subject details
 */
public class Subject {
    private int code;
    private String name;
    public Subject(int code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     *
     * @param code of the subject
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     *
     * @param name of the subject
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @return the code of the subject
     */
    public int getCode(){
        return code;
    }

    /**
     *
     * @return the name of the subject
     */
    public String getName(){
        return name;
    }
}
