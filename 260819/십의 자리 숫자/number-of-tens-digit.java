import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        boolean find = true; 
        int[] arr = new int[10];

        while (find) {
            int a = sc.nextInt();
            if(a == 0) {
                find = false;
            }
            int n = a / 10;
            arr[n]++;
        }

        for(int i = 1; i < 10; i++) {
            System.out.println(i + " - " + arr[i]);
        }

    }
}