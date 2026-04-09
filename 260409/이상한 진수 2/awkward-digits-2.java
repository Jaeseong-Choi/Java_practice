import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int[] arr = new int[a.length()];
        
        for (int i = 0; i < a.length(); i++) {
        	char c = a.charAt(i);
        	int num = (int) c - '0';
        	arr[i] = num;
        }
        
        
        int max = Integer.MIN_VALUE;
        
        for (int i = 1; i < a.length(); i++) {
        	if (arr[i] == 1) arr[i] = 0;
        	else arr[i] = 1;
        	
        	int sum = 0; 
        	
        	for (int j = 0; j < a.length(); j++) {
        		sum = sum * 2 + arr[j];
        	}
        	
        	if (sum > max) max = sum;
        	
        	if (arr[i] == 0) arr[i] = 1;
        	else arr[i] = 0;
        }
        
        System.out.println(max);

    }
}

