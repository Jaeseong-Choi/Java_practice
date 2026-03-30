import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int [2001][2001];
        int offset = 1000;
        int cnt = 0; 
        
        for (int t = 0; t < n; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            
            
            for (int i = x1; i < x2; i++) {
            	for (int j = y1; j < y2; j++) {
            		if (arr[i+offset][j+offset] == 1) continue;
            		arr[i+offset][j+offset]++;
            		cnt++;
            	}
            }
        }
        
        System.out.println(cnt);
    }
}