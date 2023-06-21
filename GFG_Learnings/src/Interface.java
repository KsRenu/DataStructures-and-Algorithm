
@FunctionalInterface
interface functionalInterface {
    int calculateSquare(int x);
}
class Interface {
    public static void main(String[] args) {
        int a=5;
        functionalInterface f = (int x) -> x*x;
        int ans = f.calculateSquare(a);
        System.out.println(ans);
    }
}
