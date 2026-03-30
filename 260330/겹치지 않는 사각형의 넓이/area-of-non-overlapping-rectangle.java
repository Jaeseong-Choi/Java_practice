import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사각형을 담을 사각형 
        int[][] sqr = new int[2001][2001];
        int offset = 1000;
        
        //겹치지 않는 사각형 A, B
        for(int t = 0; t < 2; t++) {
        	 int x1 = sc.nextInt();
             int y1 = sc.nextInt();
             int x2 = sc.nextInt();
             int y2 = sc.nextInt(); 
             
             for(int i = x1; i < x2; i++) {
            	 for (int j = y1; j < y2; j++) {
            		 sqr[i+offset][j+offset]++;
            	 }
             }
        }
        
        //겹치는 사각형
       	 int x1 = sc.nextInt();
         int y1 = sc.nextInt();
         int x2 = sc.nextInt();
         int y2 = sc.nextInt(); 
            
         for(int i = x1; i < x2; i++) {
           for (int j = y1; j < y2; j++) {
           		sqr[i+offset][j+offset]--;
           	}
          }
        
         //갯수세기 
        int cnt = 0;
        
        for(int i = 0; i < sqr.length; i++) {
           for (int j = 0; j < sqr.length; j++) {
        	   if (sqr[i][j] == 1) cnt++;
             }
          }
        
        System.out.println(cnt);
    }
}