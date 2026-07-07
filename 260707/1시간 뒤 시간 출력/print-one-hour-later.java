import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String[] strArr = a.split(":");
        int b = Integer.parseInt(strArr[0]) + 1;
        System.out.println(b +":"+strArr[1]);

        
    }
}