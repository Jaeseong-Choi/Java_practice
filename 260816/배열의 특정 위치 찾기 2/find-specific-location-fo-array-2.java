import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int odd = 0; 
        int even = 0; 

        for(int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                odd += sc.nextInt();
            } else if ( i % 2 == 0) {
                even += sc.nextInt();
            }
        }

        if (even > odd) {
            System.out.print(even - odd);
        } else {
            System.out.print(odd - even);
        }
    }
}