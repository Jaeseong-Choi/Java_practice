import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력: 기준 날짜(m1, d1)와 목표 날짜(m2, d2)
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // 1. m1/d1부터 m2/d2까지의 총 일수 차이를 구합니다.
        // 여기서는 m1/d1이 무조건 월요일이고, 그 이후 날짜인 m2/d2를 구한다고 가정합니다.
        
        int totalDays = 0;

        if (m1 < m2 || (m1 == m2 && d1 <= d2)) {
            // 미래 날짜로 가는 경우
            while (m1 != m2 || d1 != d2) {
                totalDays++;
                d1++;
                if (d1 > months[m1]) {
                    d1 = 1;
                    m1++;
                }
            }
            // 월요일(index 0)에서 totalDays만큼 지난 후의 요일
            System.out.println(days[totalDays % 7]);
        } else {
            // 과거 날짜로 가는 경우
            while (m1 != m2 || d1 != d2) {
                totalDays++;
                d1--;
                if (d1 < 1) {
                    m1--;
                    d1 = months[m1];
                }
            }
            // 월요일(index 0)에서 뒤로 totalDays만큼 간 후의 요일
            // 음수 나머지를 방지하기 위해 (0 - totalDays % 7 + 7) % 7 식을 사용합니다.
            int resultIdx = (0 - (totalDays % 7) + 7) % 7;
            System.out.println(days[resultIdx]);
        }
    }
}