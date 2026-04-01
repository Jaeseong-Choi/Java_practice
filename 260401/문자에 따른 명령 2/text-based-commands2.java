import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        //서 북 동 남  
        int dir = 1; //북쪽을 바라보고 있음.
        int nx = 0;
        int ny = 0;
        
        //북에서 L -> idx = 0, R -> idx = 2
        //동에서 L -> idx = 1, R -> idx = 3
        //서에서 L -> idx = 3, R -> idx = 1
        //남에서 L -> idx = 2, R -> idx = 0;
        // L -> 자기자신 - 1 , R -> 자기자신 + 1
        
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
        	if (c == 'L') {
        		if (dir == 0) dir = 3; 
        		dir -= 1; 
        	} else if (c == 'R') {
        		if (dir == 3) dir = 0;
        		dir += 1; 
        	} else {
        		nx += dx[dir];
        		ny += dy[dir];
        	}
        }
        
        System.out.println(nx + " " + ny);
    }
}