import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        double avg = ((double) (a+b) / 2 );
        

        System.out.println(sum + " " + avg);
    }
}