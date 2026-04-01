import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        
        int[] aArr = new int[1_000_001];
        int[] bArr = new int[1_000_001];
        
        int offSet = 500_000;
        
        int aIdx = 1 + offSet;
        
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
        
        int bIdx = 1 + offSet;
        
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
        
        int cnt = 0; 
        
        for (int i = 1; i < aArr.length - 1; i++) {
        	if (aArr[i] != bArr[i] && aArr[i+1] == bArr[i+1]) cnt++;
        }
        
        System.out.println(cnt);
        
        
        
    }
}