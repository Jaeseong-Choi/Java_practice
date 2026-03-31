import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[][] arr = new int[1001][1001];
        int[] dx = {0,0, 1, -1};
        int[] dy = {1,-1,0,0};
        // 0 - 북, 1 - 남, 3 - 동, 4 - 서
        int nx = 0;
        int ny = 0;
        
        for (int t = 0; t < a; t++) {
        	char c = sc.next().charAt(0);
        	int dist = sc.nextInt();
        	
        	for (int i = 0; i < dist; i++) {
        		if (c == 'N') {
        			nx += dx[0];
        			ny += dy[0];
        		} else if ( c == 'S') {
        			nx += dx[1];
        			ny += dy[1];
        		} else if ( c == 'E') {
        			nx += dx[2];
        			ny += dy[2];
        		} else if ( c == 'W') {
        			nx += dx[3];
        			ny += dy[3];
        		} 
        	}
        }
        
        System.out.println(nx + " " + ny);
        
        
    }
}