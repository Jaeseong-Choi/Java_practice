import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sdtNum = sc.nextInt();
        int num = sc.nextInt();
        int failNum = sc.nextInt();
        
        int[] arr =new int[sdtNum+1];
        
        int ans = -1; 
        
        for (int i = 0; i < num; i++) {
        	int a = sc.nextInt();
        	arr[a]++; 
        	if (arr[a] >= failNum) ans = a;
        }
        
        System.out.println(ans);
    }
}