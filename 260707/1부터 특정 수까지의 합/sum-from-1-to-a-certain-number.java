import java.util.*;

public class Main {
    public static void sum(int n) {
        int add = 0; 
        for (int i = 1; i <= n; i++) {
            add += i;
        }

        System.out.println(add / 10);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sum(n);
        
    }
}