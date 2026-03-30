import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i =0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        

        int cnt = 1;
        int max = 1;
        
        for (int i = 0; i < arr.length - 1; i++) {
        	
        	 if (arr[i] > 0 && arr[i+1] > 0) {
        		 cnt++;
        		 if (cnt > max) max = cnt;
        	 } else {
        		 cnt++;
        		 if (cnt > max) max = cnt;
        	 }
        	 
        	 if (arr[i] * arr[i+1] < 0) cnt = 1;
        }
        
        System.out.println(max);

    }
}

