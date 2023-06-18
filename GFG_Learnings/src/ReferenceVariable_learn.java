public class ReferenceVariable_learn {
    // Test.java
    //class Main {
        // swap() doesn't swap i and j
        public static void swap(Integer i, Integer j)
        {
            Integer temp = new Integer(i);
            //int temp = i;
            i = j;
            j = temp;
        }
        public static void main(String[] args)
        {
            Integer i = new Integer(10);
            Integer j = new Integer(20);
            int x=8;
            int y=9;
            System.out.println(" i = " + i + " , j = " + j);
            swap(i, j);
            System.out.println(" i = " + i + " , j = " + j);
            System.out.println(" x = " + x + " , y = " + y);
            swap(x,y);
            System.out.println(" x = " + x + " , y = " + y);
        }
    }

//}
