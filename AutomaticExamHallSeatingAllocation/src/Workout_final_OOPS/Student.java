package Workout_final_OOPS;

import java.util.ArrayList;

public  class Student extends User implements show {
    private String yr;

    /***
     * It's a inner class as students should not know the algorithm/logic behind the allocation, so they can't
     * predict their plaes earlier
     */
    private static class HallDetails {
        private int hallCapacity = 36;
        private ArrayList<String[]> hallDetailsList = new ArrayList<>();

        private ArrayList<String[]> studentDetailsList;
        public HallDetails(ArrayList<String[]> studentDetailsList) {
            this.studentDetailsList = studentDetailsList;
        }

        /***
         * For demo, assuming there are only 3 halls where each hall has 36 places in it.
         * @param studentDetailsList Details of all the students
         * @return returns the arraylist of arrays of hallNo,benchNo and rollNo of every student
         */
        public ArrayList<String[]> hall(ArrayList<String[]> studentDetailsList) {
            ArrayList<Integer> hallNo = new ArrayList<>();
            hallNo.add(1);
            hallNo.add(2);
            hallNo.add(3);
            ArrayList<String[]> place = place(hallNo,studentDetailsList);
            return place;
        }
        int x,hallNum,benchpostion = 0;

        /***
         * Allocating the hall and bench position to all the students
         * @param hallNo List of available halls
         * @param studentDetailsList details of all the students
         * @return returns the arraylist of arrays of hallNo,benchNo and rollNo of every student
         */
        public ArrayList<String[]> place(ArrayList<Integer> hallNo,ArrayList<String[]> studentDetailsList){
            String[] position = new String[3];
            while(hallNum<hallNo.size()) {
                hallNum += 1;
                benchpostion=1;
                while (x < hallCapacity) {
                    position = new String[]{String.valueOf(hallNum), String.valueOf(benchpostion),studentDetailsList.get(x)[0]};
                    benchpostion+=1;
                    hallDetailsList.add(position);
                    x+=1;
                }
                hallCapacity+=36;
            }
            return hallDetailsList;
        }
    }



    public Student(String id, String name, String dept, String yr) {
        super(id, name, dept);
        this.yr = yr;
    }

    /***
     * Displaying the allocated place of the particular student
     * @param studentDetailsList Details of all the students
     * @param id Id of the student whose position need to be known
     */
    public  void display(ArrayList<String[]> studentDetailsList, String id){
        HallDetails h = new HallDetails(studentDetailsList);
        ArrayList<String[]> hall = h.hall(studentDetailsList);
        for (int i = 0; i < hall.size(); i++) {
            if(hall.get(i)[2].equals(id)){
                System.out.println("The position of "+hall.get(i)[2] +" is at : Hall: "+ hall.get(i)[0]+ " benchPosition: "+hall.get(i)[1]);
            }
        }

    }

    /***
     * Displaying the allocated details of all the students
     * @param studentDetailsList Details of all the students
     */
    public static void display(ArrayList<String[]>studentDetailsList){
        HallDetails h = new HallDetails(studentDetailsList);
        ArrayList<String[]> hall = h.hall(studentDetailsList);
        for (int i = 0; i < hall.size(); i++) {
            System.out.println("Hall: "+ hall.get(i)[0]+ " benchPosition: "+hall.get(i)[1]+" id: "+hall.get(i)[2]);
        }
    }


    public String getYr() {
        return yr;
    }

    public void setYr(String yr) {
        this.yr = yr;
    }
}

