import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0; 

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();

            if (a == 0) {
                break;
            } else if (a % 2 == 1) {
                continue;
            } else {
                sum += a;
                cnt++;
            }
        }
        System.out.print(cnt+" "+sum);
    }
}