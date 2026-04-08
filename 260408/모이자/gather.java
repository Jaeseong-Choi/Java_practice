import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;

        
        for(int i = 0; i < n; i++) {
        	int sum = 0;
        	for (int j = 0; j < n; j++) {
        		sum += arr[j] * Math.abs(i - j);
        	}
        	if (sum < min) min = sum; 
        }
        
        System.out.println(min);

    }
}

