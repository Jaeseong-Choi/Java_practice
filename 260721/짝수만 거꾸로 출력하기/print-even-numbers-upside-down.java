import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int cnt = 0; 

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a % 2 == 0) {
                arr[cnt++] = a;
            }
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}