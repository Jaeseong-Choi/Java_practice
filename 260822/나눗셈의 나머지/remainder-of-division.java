import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        int total = 0;


        while(true) {
            int num = a % b;
            arr[num]++;
            a = a / b;
            if(a <= 1) {
                break; 
            }

        }

        for (int i =0; i < 10; i++) {
            total += arr[i] * arr[i];
        }

        System.out.print(total);
    }
}