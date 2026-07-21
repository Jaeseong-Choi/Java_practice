import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum = 0; 
        int cnt = 10; 

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();

            if (a == 0) {
                cnt = i;
                break;
            } else { 
                sum += a; 
            } 

        }

        System.out.printf("%d %.1f", sum , (double)sum / cnt);
    }
}