import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String str = sc.next();
        
        
        int[] months = {0 , 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        int cnt = 0; 
        int idx = 1; 
        
        while(true) {
        	
        	
        	
        	if (d1 == d2 && m1 == m2) {
        		System.out.println(cnt);
        		return;
        	}
        	
        	d1++;
        	idx++;
        	
        	if(m1 > 12) m1 = 1; 
        	if(d1 > months[m1]) {
        		d1 = 1; 
        		m1++;
        	}
        	
        	if(idx > 6) idx = 0;
        	
        	if(days[idx].equals(str)) cnt++;
        	
        	
        }
        
        
    }
}