import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr = new int [1_000_001];
        String[] color = new String[1_000_001];
        
        int idx = 0; 
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            if (dir == 'R') {
            	 for(int j = idx ; j < idx + x ; j++) {
            		 if (color[j+500_000] == null || color[j+500_000].equals("White") ) {
            			 color[j+500_000] = "Black";
            			 arr[j+500_000]++;
            			 if(arr[j+500_000] >= 4) color[j+500_000] = "Grey";
            		 }
             		

            	 }
            	 idx += x;
            	 
        	} else {
        		for(int j = idx - 1; j >=  idx - x; j--) {
        			if (color[j+500_000] == null || color[j+500_000].equals("Black") ) {
        				 color[j+500_000] = "White";
	           			 arr[j+500_000]++;
	           			 if(arr[j+500_000] >= 4) color[j+500_000] = "Grey";
  			 
           		 }
             }
        		idx -= x;
        }
            
       } 
       
        int black = 0;
        int white = 0;
        int grey = 0;
        
       for(int i = 0; i < arr.length; i++) {
    	   if (color[i] == null) continue;
    	   if (arr[i] > 0) {
    		   if (color[i].equals("Black")) {
    			   black++;
    		   } else if (color[i].equals("White")) {
    			   white++;
    		   } else {
    			   grey++;
    		   }
    	   }
       }
       
       System.out.println(white + " " + black + " " + grey);

    }
}
