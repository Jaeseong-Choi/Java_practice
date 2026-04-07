import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();        
        int[][] arr = new int[n][n];
        
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		arr[i][j] = sc.nextInt();
        	}
        }
        
        
        int cnt = 0; 
        int over3 = 0;
        
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		for (int z = 0; z < 4; z++) {
                	int nx = dx[z] + i;
                	int ny = dy[z] + j;
                	if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                		if (arr[nx][ny] == 1) cnt++; 
                		if (cnt >= 3) {
                			over3++; 
                			break;
                		}
                		
                	}
                }
        		cnt = 0; 
        	}
        }
        System.out.println(over3);
        
        
        
    }
}