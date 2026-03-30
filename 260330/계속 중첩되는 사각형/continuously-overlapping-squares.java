import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // 사각형을 담을 사각형 
        int[][] sqr = new int[201][201];
        int offset = 100;
        
        
        //색 채우기 
        for (int t = 0; t < n; t++) {
        	int x1 = sc.nextInt();
        	int y1 = sc.nextInt();
        	int x2 = sc.nextInt();
        	int y2 = sc.nextInt();
        	
        	
        	for (int i = x1; i < x2 ; i++) {
        		for (int j = y1; j < y2; j++) {
        			if (t % 2 == 0) {
        				sqr[i + offset][j + offset] = 1;
        			} else {
        				sqr[i + offset][j + offset] = 2;
        			}
        		}
        	}
        }
        
        int cnt = 0; 
        for (int i = 0; i < sqr.length; i++) {
    		for (int j = 0; j < sqr.length; j++) {
    			if (sqr[i][j] == 2) cnt++;
    		}
    	}
        System.out.println(cnt);

    }
}