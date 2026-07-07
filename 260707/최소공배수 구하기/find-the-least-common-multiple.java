import java.util.Scanner;

public class Main {
    public static void minNum(int n, int m) {
        int a = 0;

        for (int i = Math.max(n,m); i < Integer.MAX_VALUE; i++) {
            if (i % n == 0 && i % m == 0) {
                a = i; 
                System.out.println(a);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        minNum(n,m);
    }
}