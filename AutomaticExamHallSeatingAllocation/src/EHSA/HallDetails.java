package EHSA;

import java.util.ArrayList;

public class HallDetails {
    private int hallCapacity = 36;

    public ArrayList<Integer> hall() {
        ArrayList<Integer> hallNo = new ArrayList<>();
        hallNo.add(1);
        hallNo.add(2);
        hallNo.add(3);
        place(hallNo);
        return hallNo;
    }
    int x,y = 0;
    public int[] place(ArrayList<Integer> hallNo){

        int[] position = new int[36];
        while(y<hallNo.size()) {
            y += 1;
            x=0;
            System.out.println("Students in hallNo "+y+" are: ");
            while (x < 36) {
                System.out.println(x);
                x++;
            }

        }
        return position;

    }


}
