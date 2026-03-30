import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] grid = new int[2001][2001];
        int offset = 1000;
        
        // 1. 첫 번째 직사각형 (A)
        int x1 = sc.nextInt() + offset;
        int y1 = sc.nextInt() + offset;
        int x2 = sc.nextInt() + offset;
        int y2 = sc.nextInt() + offset;
        
        for(int i = x1; i < x2; i++) {
            for(int j = y1; j < y2; j++) {
                grid[i][j] = 1;
            }
        }
        
        // 2. 두 번째 직사각형 (B) - 덮어버리기
        int x3 = sc.nextInt() + offset;
        int y3 = sc.nextInt() + offset;
        int x4 = sc.nextInt() + offset;
        int y4 = sc.nextInt() + offset;
        
        for(int i = x3; i < x4; i++) {
            for(int j = y3; j < y4; j++) {
                grid[i][j] = 0;
            }
        }
        
        // 3. 남아있는 '1'의 최소/최대 좌표 찾기
        int minX = 2001, maxX = 0, minY = 2001, maxY = 0;
        boolean exists = false;
        
        for(int i = 0; i < 2001; i++) {
            for(int j = 0; j < 2001; j++) {
                if(grid[i][j] == 1) {
                    exists = true;
                    if(i < minX) minX = i;
                    if(i > maxX) maxX = i;
                    if(j < minY) minY = j;
                    if(j > maxY) maxY = j;
                }
            }
        }
        
        // 4. 결과 출력
        if(!exists) {
            System.out.println(0); // 다 가려졌으면 0
        } else {
            // maxX와 maxY는 '칸'의 인덱스이므로 실제 좌표 길이는 +1을 해줍니다.
            int width = (maxX - minX + 1);
            int height = (maxY - minY + 1);
            System.out.println(width * height);
        }
    }
}