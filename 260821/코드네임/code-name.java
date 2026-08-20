import java.util.Scanner;

class Info { 
    char codeName;
    int score;

    public Info (char codeName, int score) {
        this.codeName = codeName;
        this.score = score; 
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int num = Integer.MAX_VALUE; 
        char latter = 0; 

        Info[] info = new Info[5];
        for (int i = 0; i < 5; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            if (score < num) {
                num = score;
                latter = codeName;
            }
            info[i] = new Info(codeName, score);
        }

        System.out.print(latter + " " + num);

    }
}