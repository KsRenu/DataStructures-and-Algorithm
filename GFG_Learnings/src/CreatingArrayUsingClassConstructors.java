public class CreatingArrayUsingClassConstructors {
    int num;
    String name;
    CreatingArrayUsingClassConstructors(int num, String name){
        this.name = name;
        this.num = num;
    }

    public static void main(String[] args) {
        CreatingArrayUsingClassConstructors[] array = new CreatingArrayUsingClassConstructors[5];
        array[0]=new CreatingArrayUsingClassConstructors(1,"one");
        array[1] = new CreatingArrayUsingClassConstructors(2,"two");
        for (CreatingArrayUsingClassConstructors obj:array) {
            System.out.println(obj.name+"\t"+obj.num);
        }
    }
}
