import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArr = str.split("-");

        System.out.println(strArr[2] + "." + strArr[0] + "." + strArr[1]);

        
    }
}