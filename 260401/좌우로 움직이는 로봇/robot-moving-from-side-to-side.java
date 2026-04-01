import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        
        int[] aArr = new int[1_000_001];
        int[] bArr = new int[1_000_001];

        
        int aIdx = 1;
        
        for (int i = 0; i < n; i++) {
        	int a =sc.nextInt();
        	char c = sc.next().charAt(0);
        	
        	for (int j = 0; j < a; j++) {
        		if (c == 'R') {
        			aArr[aIdx] = aArr[aIdx-1] + 1;
        		} else {
        			aArr[aIdx] = aArr[aIdx-1] - 1;
        		}
        		aIdx++;
        	}
        }
        
        for (int i = aIdx; i < aArr.length; i++) {
            aArr[i] = aArr[aIdx - 1];
        }
        
        int bIdx = 1 ;
        
        for (int i = 0; i < m; i++) {
        	int b =sc.nextInt();
        	char c = sc.next().charAt(0);
        	
        	for (int j = 0; j < b; j++) {
        		if (c == 'R') {
        			bArr[bIdx] = bArr[bIdx-1] + 1;
        		} else {
        			bArr[bIdx] = bArr[bIdx-1] - 1;
        		}
        		bIdx++;
        	}
        }
        
        for (int i = bIdx; i < bArr.length; i++) {
            bArr[i] = bArr[bIdx - 1];
        }
        
        int cnt = 0; 
        int maxTime = Math.max(aIdx, bIdx);
        
        for (int i = 1; i < maxTime; i++) {
        	if (aArr[i] != bArr[i] && aArr[i+1] == bArr[i+1]) cnt++;
        }
        
        System.out.println(cnt);
        
        
        
    }
}