public class why2_thisKeyword {
    // Java code for using this as an argument in constructor
// call
// Class with object of Class B as its data member
    static class A {
        B obj;

        // Parameterized constructor with object of B
        // as a parameter
        A(B obj)
        {
            this.obj = obj;

            // calling display method of class B
            obj.display();
        }
    }

    static class B {
        int x = 5;

        // Default Constructor that create an object of A
        // with passing this as an argument in the
        // constructor
        B() { A obj = new A(this); }

        // method to show value of x
        void display()
        {
            System.out.println("Value of x in Class B : " + x);
        }

        public static void main(String[] args)
        {
            B obj = new B();
        }
    }

}
