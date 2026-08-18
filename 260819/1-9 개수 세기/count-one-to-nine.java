import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[a]++; 
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
}