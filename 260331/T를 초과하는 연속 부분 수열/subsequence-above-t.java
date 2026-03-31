import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int t = sc.nextInt();
        int[] arr = new int[n];
         
        for(int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int cnt = 1; 
        int max = 1; 
        
        for(int i = 0; i < n-1; i++) {
        	if (arr[i] > t && arr[i] < arr[i+1] ) {
        		cnt++; 
        		if (cnt > max) max = cnt;
        	} else cnt = 1;
        }
        
        System.out.println(max);
    }
}