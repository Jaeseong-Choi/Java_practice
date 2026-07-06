public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int a = 5;
        int b = 6;
        int c = 7;

        int copy;
        int copy2; 

        copy = a; 
        copy2 = b;

        a = c;
        c = copy2;
        b = copy;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}