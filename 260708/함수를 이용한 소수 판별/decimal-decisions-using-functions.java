import java.util.Scanner;

public class Main {
    
    public static boolean isPrime (int n) {
        if (n == 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
        

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int sum = 0;

        for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
            if(isPrime(i)) sum += i;
        }

        System.out.println(sum);
    }
}