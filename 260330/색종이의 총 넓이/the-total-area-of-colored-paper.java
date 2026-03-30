import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // 사각형을 담을 사각형 
        int[][] sqr = new int[201][201];
        int offset = 100;
        int cnt = 0;
        //색 채우기 
        for (int t = 0; t < n; t++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	for (int i = x; i < x + 8; i++) {
        		for (int j = y; j < y+8; j++) {
        			if (sqr[i + offset][j + offset] == 1) continue;
        			sqr[i + offset][j + offset]++;
        			cnt++;
        		}
        	}
        }
        
        System.out.println(cnt);

    }
}