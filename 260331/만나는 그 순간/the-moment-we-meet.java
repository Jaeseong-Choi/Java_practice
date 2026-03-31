import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int[] aArr = new int[1_000_000];
        int[] bArr = new int[1_000_000];
        
        int aDir = 500_000; 
        
        for(int i = 0; i < a; i++) {
        	char c = sc.next().charAt(0);
        	int d = sc.nextInt();
        	if (c == 'R') {
        		aArr[aDir+d]++;
        		aDir += d;
        	} else {
        		aArr[aDir - d]++;
        		aDir -= d; 
        	}
        	
        }
        
        int bDir = 500_000;
        int cnt = 0;
        
        for (int i = 0; i < b; i++) {
        	char c = sc.next().charAt(0);
        	int d = sc.nextInt();
        	if (c == 'R') {
        		for (int j = bDir; j < bDir + d; j++) {
        			if(aArr[j] == 1) break;
        			cnt++;
        		}
        		bDir += d;
        	} else {
        		for (int j = bDir; j > bDir - d; j--) {
        			if(aArr[j] == 1) break;
        			cnt++;
        		}
        		bDir -= d;
        	}
        }
        
        System.out.println(cnt);
         
    }
}