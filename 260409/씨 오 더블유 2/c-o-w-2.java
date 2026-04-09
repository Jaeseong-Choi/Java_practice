import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = sc.next();
        char[] arr = new char[n];
        
        for (int i = 0; i < n; i++) {
        	char c = str.charAt(i);
        	arr[i] = c;
        }
        
        int cnt = 0; 
        
        for(int i = 0; i < n; i++) {
        	if(arr[i] != 'C') continue;
        	for (int j = i+1; j < n; j++) {
        		if(arr[j] != 'O') continue;
        		for (int k = j + 1; k < n; k++) {
        			if(arr[k] != 'W') continue;
        			cnt++;
        			
        		}
        	}
        }
        
        System.out.println(cnt);
        
    }//main
}//MAIN

