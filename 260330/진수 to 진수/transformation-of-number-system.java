import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A는 N의 A진수 / 	이걸 10진수로 바꿔서 다시 B진수로 변경 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int[] arr = new int[10];
        
        int idx = 0;
        
        //10진수 바꾸기 
        while(true) {
        	if(n == 0) {
        		break;
        	}
        	
        	arr[idx++] = n % 10;
        	n /= 10; 	
        	
        }
        
        
        int sum = 0;
        
        for (int i = idx-1; i >= 0; i--) {
        	sum = sum * a + arr[i];
        }
        
        
        //B진수로 바꾸기
        int[] binary = new int[32];
        int cnt = 0;
        
        while(true) {
        	if(sum <= 0) {
        		break;
        	}
        	
        	binary[cnt++] = sum % b;
        	sum /= b;
        }
        
        for (int i = cnt -1; i >= 0; i--) {
        	System.out.print(binary[i]);
        	
        }

    }
}