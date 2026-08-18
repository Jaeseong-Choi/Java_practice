import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        int n = 0;

        while (cnt < 2) {
            n += num ;
            System.out.print(n + " ");
            if (n % 5 == 0) {
                cnt++;
            }
        }
    }
}