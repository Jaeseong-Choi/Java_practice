import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char str[] = new char[10];

        for (int i = 0; i < 10; i++) {
            str[i] = sc.next().charAt(0);
            if(i == 1 || i == 4 || i == 7) {
                System.out.print(str[i] + " ");
            }
        }
    }
}