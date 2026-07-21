import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int cnt = 0; 


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                int a = sc.nextInt();
                sum += a;
            }
            if ((sum/4)>= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
            sum = 0;
        }
        System.out.println(cnt);
    }
}