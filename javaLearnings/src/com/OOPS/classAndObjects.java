package com.OOPS;

public class classAndObjects {
    public static void main(String[] args) {
        System.out.println("Example for constructor overloading");
        Student s1 = new Student();
        Student s2 = new Student("std1","1","sda",99);
        Student s3 = new Student("std2","2","sdafbvdf",19);
        Student s4 = new Student(s2);//other
        s4.name= "change";
        System.out.println();
        System.out.println(s2.name);

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.address);
        System.out.println(s1.averageMarks);
        System.out.println();
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.address);
        System.out.println(s2.averageMarks);
        System.out.println();
        System.out.println(s3.name);
        System.out.println(s3.rollNo);
        System.out.println(s3.address);
        System.out.println(s3.averageMarks);
        System.out.println();
        System.out.println(s4.name);
        System.out.println(s4.rollNo);
        System.out.println(s4.address);
        System.out.println(s4.averageMarks);
        System.out.println();

        Student1 s5 = new Student1();
        System.out.println(s5.name);

        final Student1 s6 = new Student1("std6","2","sdafbvdf",19);;//other
        s6.name= "change";
        System.out.println(s6.name);

        //int i=1;
        //Student1 finalize;
        //for(i=0;i<100000000;i++){
         //   finalize = new Student1("std6","2","sdafbvdf",19); uncomment to check the functionality of finalize()
        //}
    }

    static class Student{
        String name;
        String rollNo;
        String address;
        int averageMarks;

        Student(String name, String rollNo, String address, int averageMarks){
            this.name = name;
            this.address = address;
            this.rollNo = rollNo;
            this.averageMarks = averageMarks;
        }

        Student(){
            this.name = "Renu";
            this.address = "xyz colony";
            this.rollNo = "000";
            this.averageMarks = 100;
        }

        Student(Student other){
            this.name = other.name;
            this.address = other.address;
            this.rollNo = other.rollNo;
            this.averageMarks = other.averageMarks;
        }





        }
    static class Student1{
        String name;
        String rollNo;
        String address;
        int averageMarks;

        Student1(){
            this("name created using this function","2","sdafbvdf",19);
        }
        Student1(String name, String rollNo, String address, int averageMarks){
            this.name = name;
            this.address = address;
            this.rollNo = rollNo;
            this.averageMarks = averageMarks;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("This object is about to be cleaned");
        }
    }
}
