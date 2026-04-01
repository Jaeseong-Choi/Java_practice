import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int m = sc.nextInt();
         
        int[] aArr = new int [1_000_000];
        int[] bArr = new int [1_000_000];
        
        int aIdx = 1; 
        for(int i = 0; i < n; i++) {
        	int v = sc.nextInt(); // 속도
        	int t = sc.nextInt(); // 시간
        	
        	for (int j = 0; j < t; j++) {
        		aArr[aIdx] = aArr[aIdx - 1] + v; 
        		aIdx++;
        	}
        }
        
        int bIdx = 1; 
        for(int i = 0; i < m; i++) {
        	int v = sc.nextInt(); // 속도
        	int t = sc.nextInt(); // 시간
        	
        	for (int j = 0; j < t; j++) {
        		bArr[bIdx] = bArr[bIdx - 1] + v; 
        		bIdx++;
        	}
        }
        
        
        int cnt = 0;
        int maxTime = Math.max(aIdx, bIdx);
        char first = ' ';
        
        for(int i = 1; i < maxTime; i++) {
        	if(aArr[i] == bArr[i]) { // 두개가 같을 경우 
        		if (first == 'S') continue;
        		first = 'S';
        		cnt++;
        	} else if (aArr[i] > bArr[i]) {
        		if (first == 'A') continue;
        		first = 'A';
        		cnt++;
        	} else if (aArr[i] < bArr[i]) {
        		if (first == 'B') continue;
        		first = 'B';
        		cnt++;
        	}
        }
        
        System.out.println(cnt);
    }
}