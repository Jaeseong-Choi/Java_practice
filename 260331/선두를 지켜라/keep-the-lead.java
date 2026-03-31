import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        
        int[] aArr = new int[1_000_001];
        int[] bArr = new int[1_000_001];
        
        //A 거리 
        int Aidx = 1; 
        for(int i = 0; i < n; i++) {
        	int v = sc.nextInt();
        	int t = sc.nextInt(); 
        	
        	for (int j = 0; j < t; j++) {
        		aArr[Aidx] = aArr[Aidx - 1] + v; 
        		Aidx++;
        	}
        }
        
        //B거리 
        int Bidx = 1;
        for(int i = 0; i < m; i++) {
        	int v = sc.nextInt();
        	int t = sc.nextInt(); 
        	
        	for (int j = 0; j < t; j++) {
        		bArr[Bidx] = bArr[Bidx - 1] + v; 
        		Bidx++;
        	}
        }
        
        int max = Math.max(Aidx, Bidx);
        int cnt = 0;
        char high = ' ';
        for (int i = 0; i < max; i++) {
        	if (aArr[i] > bArr[i]) {
        		if (high == 'b')  cnt++;
        		high = 'a';
        		
        	} else {
        		if (high == 'a') cnt++;
        		high ='b';

        	}
        }
        
        System.out.println(cnt);
        
        
    }
}