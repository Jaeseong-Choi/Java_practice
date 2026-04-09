import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i = 0; i < n; i++) {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        
        
        
        for (int skip = 1; skip < n - 1; skip++) {
        	int sum = 0; 
        	
        	int bx = 0;
            int by = 0;
            
        	for (int i = 0; i < n; i++) {
        		if (skip == i) continue; 
        		
        		sum += Math.abs(x[bx] - x[i]) + Math.abs(y[by] - y[i]);
        		bx = i;
        		by = i;
        	}
        	
        	
        	min = Math.min(sum, min);
        }
        
        System.out.println(min);

    }//main
}//MAIN

