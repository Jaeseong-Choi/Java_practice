import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[8];
        int cnt = 0; 
        int idx = 0;
        
        while(true) {
        	if (n <= 0) break; 
        	
        	arr[cnt++] = n % 10;
        	n /= 10;
        	idx++; 
        }
        
        int sum = 0; 
        
        for (int i = idx-1; i >= 0; i--) {
        	sum = sum * 2 + arr[i];
        }
        
        System.out.println(sum);
        
        
    }
}