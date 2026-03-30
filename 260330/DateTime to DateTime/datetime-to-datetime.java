import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int d1 = 11;
        int h1 = 11;
        int m1 = 11;
        
        int d2 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt(); 
        
        if (d1 >= d2 && h1 > h2) {
        			System.out.println(-1);
        			return;
        	
        }

        
        int sum1 = (d1 * 1440) + (h1 * 60) + m1;
        int sum2 = (d2 * 1440) + (h2 * 60) + m2;
        
        System.out.println(sum2-sum1);
    }
}