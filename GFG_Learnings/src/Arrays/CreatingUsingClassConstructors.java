package Arrays;

public class CreatingUsingClassConstructors {
    int num;
    String name;
    CreatingUsingClassConstructors(int num, String name){
        this.name = name;
        this.num = num;
    }

    public static void main(String[] args) {
        CreatingUsingClassConstructors [] array = new CreatingUsingClassConstructors[5];
        array[0]=new CreatingUsingClassConstructors(1,"one");
        array[1] = new CreatingUsingClassConstructors(2,"two");
        for (CreatingUsingClassConstructors obj:array) {
            System.out.println(obj.name+"\t"+obj.num);
        }
    }
}
