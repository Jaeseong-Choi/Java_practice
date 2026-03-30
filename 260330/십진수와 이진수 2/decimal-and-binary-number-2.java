import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binary = new int[10];
        
        int cnt = 0; 
        
        while(true) {
        	if (n <= 0) {
        		binary[cnt++] = n;
        		break; 
        	}
        	
        	binary[cnt++] = n % 10;
        	n /= 10; 
        }
        
        int sum = 0; 
        
        for(int i = cnt - 1; i >= 0 ; i--) {
        	sum = sum * 2 + binary[i];
        }
        
        sum *= 17;
        
        int[] newArr = new int[32];
        int idx = 0;
        
        while(true) { 
        	if (sum == 0) {
        		break;
        	}
        	
        	newArr[idx++] = sum % 2;
        	sum /= 2;
        	
        }
        
        for (int i = idx - 1; i >= 0; i--) {
        	System.out.print(newArr[i] + "");
        }
    }
}