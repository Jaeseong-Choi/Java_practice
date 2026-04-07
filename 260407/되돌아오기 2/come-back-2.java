import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 명령 입력 (예: FFFLRL...)
        if (!sc.hasNext()) return;
        String s = sc.next();
        
        // 현재 위치 (0, 0)
        int x = 0;
        int y = 0;
        
        // 경과 시간
        int time = 0;
        
        // 방향 설정 (북:0, 동:1, 남:2, 서:3)
        // 북쪽(N)을 보고 시작하므로 초기 dir은 0
        int[] dx = {-1, 0, 1, 0}; // 행(세로) 변화량
        int[] dy = {0, 1, 0, -1}; // 열(가로) 변화량
        int dir = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char cmd = s.charAt(i);
            
            if (cmd == 'F') {
                // 1. 전진: 1초 소요 및 좌표 이동
                time++;
                x += dx[dir];
                y += dy[dir];
                
                // ★ 이동 직후에 (0, 0)인지 확인
                if (x == 0 && y == 0) {
                    System.out.println(time);
                    return; // 처음으로 돌아온 순간이므로 즉시 종료
                }
                
            } else if (cmd == 'R') {
                // 2. 오른쪽 회전: 1초 소요 및 방향 변경
                time++;
                dir = (dir + 1) % 4;
                
            } else if (cmd == 'L') {
                // 3. 왼쪽 회전: 1초 소요 및 방향 변경
                time++;
                dir = (dir + 3) % 4; // (dir - 1 + 4) % 4와 같음
            }
            
            // 회전(L, R) 직후에는 좌표가 변하지 않으므로 (0,0) 체크를 하지 않습니다.
            // 만약 여기서 체크를 하면 시작하자마자 (0,0)이라서 종료될 수 있습니다.
        }
        
        // 모든 명령을 수행했는데도 (0,0)에 오지 못했다면 -1 출력
        System.out.println(-1);
    }
}