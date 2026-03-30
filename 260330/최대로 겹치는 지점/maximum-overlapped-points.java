import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[100];
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
        	int A = sc.nextInt();
        	int B = sc.nextInt();
        	
        	for (int j = A ; j <= B; j++) {
        		arr[j]++;
        		if (arr[j] > max) max = arr[j];
        	}
        }
        
        System.out.println(max);
        
    }
}