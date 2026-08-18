import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]*arr[i] + " ");
        } 
    }
}