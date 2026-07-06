public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 3;
        int b = 5;
        int copy;

        copy = a;
        a = b;
        b = copy;

        System.out.println(a);
        System.out.println(b);
    }
}