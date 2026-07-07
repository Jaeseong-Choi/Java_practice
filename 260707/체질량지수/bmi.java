import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //h*h / 10000*w
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int d = h*h;
        int u = 10000*w;

        int obs = u / d;

        if (obs >= 25) {
            System.out.println(obs);
            System.out.println("Obesity");
        } else {
            System.out.println(obs);
        }
    }
}