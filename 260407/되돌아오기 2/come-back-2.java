import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 명령 문자열 (최대 100,000자)
        String s = sc.next();
        
        // 방문한 좌표를 저장할 Set (메모리 효율적)
        // 좌표를 "x,y" 형태의 문자열로 변환하여 저장합니다.
        HashSet<String> visited = new HashSet<>();
        
        // 방향 설정 (북, 동, 남, 서 순서)
        // 문제에서 처음 북쪽을 향한다고 했으므로 dir = 0 (북)
        int[] dx = {-1, 0, 1, 0}; // 행(세로) 변화
        int[] dy = {0, 1, 0, -1}; // 열(가로) 변화
        int dir = 0; 
        
        // 시작 좌표 (0, 0)
        int x = 0;
        int y = 0;
        
        // 시작점 방문 표시
        visited.add(x + "," + y);
        
        int cnt = 0; // 경과 시간(초)
        
        for (int i = 0; i < s.length(); i++) {
            char cmd = s.charAt(i);
            
            if (cmd == 'F') {
                // 1초 소요하여 한 칸 전진
                x += dx[dir];
                y += dy[dir];
                cnt++;
                
                // 현재 좌표를 문자열 키로 생성
                String currentPos = x + "," + y;
                
                // 만약 이미 방문한 적이 있는 좌표라면?
                if (visited.contains(currentPos)) {
                    System.out.println(cnt); // 그때의 시간을 출력하고 종료
                    return;
                }
                
                // 처음 가는 곳이라면 방문 목록에 추가
                visited.add(currentPos);
                
            } else if (cmd == 'R') {
                // 1초 소요하여 오른쪽 90도 회전
                cnt++;
                dir = (dir + 1) % 4;
            } else if (cmd == 'L') {
                // 1초 소요하여 왼쪽 90도 회전
                cnt++;
                dir = (dir + 3) % 4; // (dir - 1 + 4) % 4와 같음
            }
        }
        
        // 끝까지 움직였는데 재방문이 없으면 -1 출력
        System.out.println(-1);
    }
}