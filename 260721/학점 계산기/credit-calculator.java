import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

         double sum = 0;

         for(int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            sum += a; 
         }
        double avg = sum / n ;

         System.out.printf("%.1f", avg);
         System.out.println();

         if (avg >= 4.0) {
            System.out.println("Perfect");
         } else if (avg >= 3.0) {
            System.out.println("Good");
         } else {
            System.out.println("Poor");
         }


    }
}