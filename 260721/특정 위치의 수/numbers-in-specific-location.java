import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            arr[i] = a;

            if (i == 2 || i == 4 || i == 9) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}