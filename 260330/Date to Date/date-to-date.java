import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int cnt = 1;

        while(true) {
        	
        	if(d1 > months[m1]) {
            	d1 = 1; 
            	m1++;
            }
            
            if (m1 > 12) m1 = 1; 
            
            if (m1 == m2 && d1 == d2) {
            	System.out.println(cnt);
            	return;
            } 
            
        	cnt++;
        	d1++;
        	
            
        }
    }
}