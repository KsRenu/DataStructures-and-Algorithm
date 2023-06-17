public class CreatingArrayUsingObjects {
    String name;
    CreatingArrayUsingObjects(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        CreatingArrayUsingObjects[]  arr = new CreatingArrayUsingObjects[]{new CreatingArrayUsingObjects("one"), new CreatingArrayUsingObjects("two")};
        for (CreatingArrayUsingObjects obj1: arr) {
            System.out.println(obj1.name);

        }
    }
}
