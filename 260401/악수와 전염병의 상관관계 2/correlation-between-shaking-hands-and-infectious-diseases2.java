import java.util.Scanner;
import java.util.Arrays;

class Handshake implements Comparable<Handshake> {
    int time, x, y;

    public Handshake(int time, int x, int y) {
        this.time = time;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Handshake other) {
        return this.time - other.time; // 시간 기준 오름차순 정렬
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 개발자 수 
        int k = sc.nextInt(); // 전염 가능 횟수
        int p = sc.nextInt(); // 첫 감염자 번호 
        int t = sc.nextInt(); // 악수 횟수
        
        // 감염 여부와 악수 횟수를 기록할 배열
        boolean[] infected = new boolean[n + 1];
        int[] shakeCount = new int[n + 1];
        
        // 초기 감염자 설정
        infected[p] = true; 
        
        // 악수 정보를 담을 배열 생성
        Handshake[] shakes = new Handshake[t];
        
        for (int i = 0; i < t; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            shakes[i] = new Handshake(time, x, y);
        }
        
        // 1. 시간 순서대로 정렬 (이 한 줄로 최소값 찾는 복잡한 로직이 해결됩니다!)
        Arrays.sort(shakes);
        
        // 2. 시간 순서대로 악수 시뮬레이션
        for (int i = 0; i < t; i++) {
            int px = shakes[i].x;
            int py = shakes[i].y;
            
            // 두 사람이 현재 전염병을 옮길 수 있는 상태인지 '미리' 판별 (핵심 포인트)
            boolean xCanInfect = infected[px] && shakeCount[px] < k;
            boolean yCanInfect = infected[py] && shakeCount[py] < k;
            
            // x가 전염시킬 수 있다면 y를 감염시키고 x의 악수 횟수 증가
            if (xCanInfect) {
                infected[py] = true;
                shakeCount[px]++;
            }
            
            // y가 전염시킬 수 있다면 x를 감염시키고 y의 악수 횟수 증가
            if (yCanInfect) {
                infected[px] = true;
                shakeCount[py]++;
            }
        }
        
        // 3. 최종 감염자 출력 (감염되었으면 1, 아니면 0)
        for (int i = 1; i <= n; i++) {
            if (infected[i]) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}