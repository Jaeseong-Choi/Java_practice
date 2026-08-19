import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int n = 10; 

        while(true) {
            int a = sc.nextInt();
            if(a == 0) break;

            int b = a / 10;
            arr[b]++;

        }

        for (int i = 10; i > 0; i--) {
            System.out.println(n * i + " - " + arr[i]);
        }
    }
}