import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        //월 일 년  / 년 월 일 

        String str = sc.next();
        String[] strArr = str.split("\\.");

        System.out.println(strArr[1] + "-" + strArr[2] + "-" + strArr[0]);
        
    }
}