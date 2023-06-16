package Arrays;

public class CreatingUsingObjects {
    String name;
    CreatingUsingObjects(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        CreatingUsingObjects[]  arr = new CreatingUsingObjects[]{new CreatingUsingObjects("one"), new CreatingUsingObjects("two")};
        for (CreatingUsingObjects obj1: arr) {
            System.out.println(obj1.name);

        }
    }
}
