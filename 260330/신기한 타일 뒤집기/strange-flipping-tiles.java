import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int offSet = 500_000;
        int[] num = new int[1_000_001];
        String[] color = new String[1_000_001];
        
        int idx = 0; 
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            
            if (d == 'R') {
            	for (int j = idx; j < idx + x; j++) {
            		num[j+offSet]++;
            		if (color[j+offSet] == null || color[j+offSet].equals("White")) 
            			color[j+offSet] = "Black";
            	}
            	idx = idx + x - 1;
            } else {
            	for (int j = idx; j > idx - x; j--) {
            		num[j+offSet]++;
            		if (color[j+offSet] == null || color[j+offSet].equals("Black")) 
            			color[j+offSet] = "White";
            	}
            	idx = idx - x + 1;
            }
        }
        
        int b = 0; 
        int w = 0;
        for (int i = 0; i < num.length; i++) {
        	if(num[i] > 0) {
        		if (color[i].equals("Black")) b++;
        		else w++;
        	}
        }
       
        System.out.println(w + " " + b);
    }
}
