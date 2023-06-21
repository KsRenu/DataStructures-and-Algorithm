public class StaticKeyword {
    /*
    https://beginnersbook.com/2013/04/java-static-class-block-methods-variables/
    Static Variables:
        Static variables can be accessed directly in Static method
        Static variables are shared among all the instances of class
    Static Methods
        static method main is accessing static variables without object
        Static method accessed directly in static and non-static method
        cannot be overriden , if tried child classes method will be hidden.
    Static Class
        Nested static class doesn’t need reference of Outer class
        A static class cannot access non-static members of the Outer class
     */
    static class test{
        int x=5;
        void method(){

            System.out.println("Inside the static class");
            System.out.println(x+x);
        }

    }

    static int var1 = 5;
    int var2 = 10;
    static void disp(){
        System.out.println("Value inside the display function");
        System.out.println("var1: "+var1);
    }
    void fun(){
        System.out.println("Calling the disp function");
        disp();
    }


    public static void main(String[] args) {
        disp();
        /////////////////////////
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        obj1.var1 = 34;
        obj1.var2 = 100;
        System.out.println("Before");
        System.out.println("Obj1.var1: "+ obj1.var1);
        System.out.println("Obj1.var2: "+ obj1.var2);
        System.out.println("Obj.var1: "+ obj2.var1);
        System.out.println("Obj1.var2: "+ obj2.var2);
        obj2.var1 = 134;
        obj2.var2 = 200;
        System.out.println("After");
        System.out.println("Obj1.var1: "+ obj1.var1);
        System.out.println("Obj1.var2: "+ obj1.var2);
        System.out.println("Obj.var1: "+ obj2.var1);
        System.out.println("Obj1.var2: "+ obj2.var2);
        ////////////////////
        System.out.println("Printing the value of static variable without object: "+var1);
        /////////////
        obj1.fun();
        disp();
        ////////
        StaticKeyword.test obj3 = new StaticKeyword.test();
        obj3.method();
        obj3.x = 10;
        obj3.method();


        Base obj = new Derived();

        // Here Derive's add() is called
        //according to overriding rules
        System.out.println(obj.add(4, 5));

        //This should invoke the print method of class Derive,
        //as per overriding rules.
        //Because a static method can't be overridden,
        //it uses Base's print instead
        obj.print();
        System.out.println("trying the static local variable inside methods but throws error ");
        System.out.println(obj.add(3,4));



    }
}
// Parent class
class Base {

    // Non-static method which will be overridden in derived class
    public int add(int a, int b) {
        //static int var10 = 10;
        //System.out.println(var10);
        System.out.println("In the base class.");
        return a + b;
    }

    // static method which will not be overridden
    //in the derived class
    public static void print() {
        System.out.println("In the Base class.");
    }
}

// Child class
class Derived extends Base {

    // This method overrides add() of Base class
    // because it not a static method
    public int add(int a, int b) {
        System.out.println("In the child class.");
        return a + b;
    }

    // This method is hidden by print() in Base
    public static void print() {
        System.out.println("In the child class.");
    }
}
