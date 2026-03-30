import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 충분한 크기의 배열 선언 (좌표 -500,000 ~ 500,000)
        int offset = 500_000;
        int[] cntW = new int[1_000_001];
        int[] cntB = new int[1_000_001];
        int[] color = new int[1_000_001]; // 0:무색, 1:흰색, 2:검은색, 3:회색
        
        int cur = 0; // 로봇의 현재 위치 (타일 번호)
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            if (dir == 'R') {
                // 현재 위치 포함 오른쪽으로 x칸: [cur, cur + x - 1]
                for (int j = cur; j < cur + x; j++) {
                    int pos = j + offset;
                    if (color[pos] == 3) continue; // 이미 회색이면 무시
                    
                    color[pos] = 2; // 검은색으로 변경
                    cntB[pos]++;
                    if (cntW[pos] >= 2 && cntB[pos] >= 2) color[pos] = 3;
                }
                // 마지막으로 칠한 타일 위치에 정지
                cur = cur + x - 1;
            } else {
                // 현재 위치 포함 왼쪽으로 x칸: [cur - x + 1, cur]
                for (int j = cur; j > cur - x; j--) {
                    int pos = j + offset;
                    if (color[pos] == 3) continue;
                    
                    color[pos] = 1; // 흰색으로 변경
                    cntW[pos]++;
                    if (cntW[pos] >= 2 && cntB[pos] >= 2) color[pos] = 3;
                }
                // 마지막으로 칠한 타일 위치에 정지
                cur = cur - x + 1;
            }
        }
        
        int w = 0, b = 0, g = 0;
        for (int i = 0; i < color.length; i++) {
            if (color[i] == 1) w++;
            else if (color[i] == 2) b++;
            else if (color[i] == 3) g++;
        }
        System.out.println(w + " " + b + " " + g);
    }
}