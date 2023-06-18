//what is the purpose of this here


public class why1_thisKeyword {
    // Java code for using 'this' keyword
// to return the current class instance
    //class Test {
        int a;
        int b;

        // Default constructor
        ///Test()
    why1_thisKeyword()
        {
            a = 10;
            b = 20;
        }

        // Method that returns current class instance
        //Test get() { return this; }
    why1_thisKeyword get() { return this; }
        // Displaying value of variables a and b
        void display()
        {
            System.out.println("a = " + a + " b = " + b);
        }

        public static void main(String[] args)
        {
            //Test object = new Test();
            //object.get().display();
            why1_thisKeyword object = new why1_thisKeyword();
            object.get().display();
        }
   // }

}
