import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char[] arr = new char[s.length()];
        
        
        
        for (int i = 0; i < s.length(); i++) {
        	arr[i] = s.charAt(i);

        } // for - i
        int cnt = 0;
        boolean find = false; 
        
        for (int i = 0; i < s.length(); i++) {        		
	        	if (arr[i] == '(' && !find) {
	        		find = true;
	        	}
	        	if (!find) continue;
        	for (int j = i+1; j < s.length() ; j++) {
        		if (i == j) break;

        		if (arr[j] == ')') cnt++;
  
        	}// for - j
        	find = false;
        } // for - i
        
        System.out.println(cnt);

    }
}

