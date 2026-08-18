import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 2; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }

        for(int i = 2; i < 10; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            if(arr[i] >= 10) {
                arr[i] = arr[i] - 10;
            }

            System.out.print(arr[i] + " ");
        }
    }
}