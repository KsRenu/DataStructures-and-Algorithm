public class OuterClass {
    static int one = 1;
    static class InnerStaticClass{
        void disp(){
            System.out.println("value inside InnerStaticClass: "+one);
        }
    }

    class InnerNormalClass{
        void disp(){
            System.out.println("value inside InnerNormalClass: "+one);
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling static inner class");
        OuterClass.InnerStaticClass obj1 = new InnerStaticClass();
        obj1.disp();
        System.out.println("Calling the normal inner class");
        OuterClass obj2 = new OuterClass();
        OuterClass.InnerNormalClass obj3 = obj2.new InnerNormalClass();
        //InnerNormalClass obj3 = new InnerNormalClass();
        obj3.disp();
    }

}
