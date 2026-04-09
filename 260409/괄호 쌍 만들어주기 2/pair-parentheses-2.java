import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next(); 
        char[] c = new char[str.length()];
        //boolean[] visited = new boolean[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
        	char a = str.charAt(i);
        	c[i] = a; 
        }
        
        int cnt = 0; 
        boolean match = false; 
        
        for (int i = 0; i < str.length() - 1; i++) {
        	if (c[i] == '(' && c[i+1] == '(') match = true;	
        	
        	
        	for (int j = i+2 ; j < str.length() - 1; j++) {
        		if (!match) break;
        		if (c[j] == ')' && c[j+1] == ')') cnt++;
        	}
        	match = false;
        }
        
        System.out.println(cnt);
        
    }//main
}//MAIN

