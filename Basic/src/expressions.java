public class expressions {
    public static void main(String[] args) {
        int n1 =10;
        System.out.println("n1+1(not stored in memeory as its not assigned) = "+ (n1+1) + "\nn1+1(memory in value incremented automaticaly as ++n1 is equal to n1+=1) = "+ (++n1)+ "\nn1+1(value in memory is changed and incremented , incremented value will be printed after assignment) = "+ (n1++) );
    }
}
