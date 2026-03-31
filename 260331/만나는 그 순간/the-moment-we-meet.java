import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] aArr = new int[1_000_000];
		int[] bArr = new int[1_000_000];

		int timeA = 1; 
		
		for (int i = 0; i < a; i++) {
			char c = sc.next().charAt(0);
			int x = sc.nextInt();
			
			for (int j = 0; j < x; j++) {
				if (c == 'R') {
					aArr[timeA] = aArr[timeA - 1] + 1;
				} else {
					aArr[timeA] = aArr[timeA - 1] - 1;
				}
				timeA++;
			}
		}// a배열 for문
		
		int timeB = 1;
		
		for (int i = 0; i < b; i++) {
			char c = sc.next().charAt(0);
			int x = sc.nextInt();
			
			for (int j = 0; j < x; j++) {
				if (c == 'R') {
					bArr[timeB] = bArr[timeB - 1] + 1;
				} else {
					bArr[timeB] = bArr[timeB - 1] - 1;
				}
				timeB++;
			}
		} // b배열 for문
		int max = Math.max(timeA, timeB);
		int ans = -1;
		for (int i = 1; i < max; i++) {
			if(bArr[i] == aArr[i]) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}