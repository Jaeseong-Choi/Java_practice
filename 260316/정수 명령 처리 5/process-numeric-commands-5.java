import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
        	String str = sc.next();
        	
        	
        	if (str.equals("push_back")) {
        		int num = sc.nextInt();
        		list.add(num);
        	}
        	else if (str.equals("get")) {
        		int num = sc.nextInt();
        		System.out.println(list.get(num - 1));
        	}
        	else if (str.equals("size")) System.out.println(list.size());
        	else if (str.equals("pop_back")) list.remove(list.size()-1); 
        	
        }
    }
}