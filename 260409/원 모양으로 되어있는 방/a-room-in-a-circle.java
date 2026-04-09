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
        
        for (int i = 0; i < n; i++) {
        	int sum = 0; 
        	
        	for (int j = 0; j < n; j++) {
        		int dist = (j - i + n) % n;
        		
        		sum += arr[j] * dist;
        	}
        	if (min > sum) min = sum; 	 
        }
        
        System.out.println(min);
    }//main
}//MAIN

