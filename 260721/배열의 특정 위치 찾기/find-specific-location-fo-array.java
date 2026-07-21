import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];

        int sum = 0; 
        double avg = 0; 
        int cnt = 0;

        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            arr[i] = a;

            if (i % 2 == 0) {
                sum += arr[i];
            } 
            
            if (i % 3 == 0) {
                avg += (double) arr[i];
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sum, avg/cnt);
    }
}