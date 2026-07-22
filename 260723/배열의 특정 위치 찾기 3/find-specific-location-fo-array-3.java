import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int sum = 0; 

        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();

             if (n == 0) {
                int count = 0;
                for (int j = i - 1; j >= 0 && count < 3; j--) {
                    sum += arr[j];
                    count++;
                }
                break;
            } else {
                arr[i] = n;
            }
        }

        System.out.println(sum);
        
    }
}