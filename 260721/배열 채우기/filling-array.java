import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[10];
        int num = arr.length - 1; 

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();

            if (a == 0)  {
                num = i - 1;
                break; 
            }

            arr[i] = a;
        }

        for (int i = num; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}