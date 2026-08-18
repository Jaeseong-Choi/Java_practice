import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] even = new int[n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even[num++] = arr[i];
            }
        }

        for(int i = 0; i < num; i++) {
            System.out.print(even[i] + " ");
        }
    }
}