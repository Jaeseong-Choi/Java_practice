import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // 방문한 좌표를 저장할 Set (메모리 효율적)
        HashSet<String> visited = new HashSet<>();
        
        // 방향: 0(북), 1(동), 2(남), 3(서) - dr, dc 설정에 따라 다름
        int[] dr = {-1, 0, 1, 0}; 
        int[] dc = {0, 1, 0, -1};
        int dir = 0; 
        
        int x = 0;
        int y = 0;
        
        // 시작점 저장
        visited.add(x + "," + y);
        
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'F') {
                x += dr[dir];
                y += dc[dir];
                cnt++;
                
                // 좌표를 "x,y" 형태의 문자열로 만들어 확인
                String currentPos = x + "," + y;
                if (visited.contains(currentPos)) {
                    System.out.println(cnt);
                    return;
                }
                visited.add(currentPos);
                
            } else if (c == 'R') {
                cnt++;
                dir = (dir + 1) % 4; // 더 깔끔한 방향 전환
            } else if (c == 'L') {
                cnt++;
                dir = (dir + 3) % 4; // (dir - 1 + 4) % 4 와 같음
            }
        }
        
        System.out.println(-1);
    }
}