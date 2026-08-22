import java.util.Scanner;

class Info {
    String name;
    int code; 

    public Info (String name, int code) {
        this.name = name; 
        this.code = code; 
    }

    public Info () {
        this.name = "codetree";
        this.code = 50;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Info info = new Info();
        System.out.println("product " + info.code + " is " + info.name);

        Info info2 = new Info(id2, code2);
        System.out.println("product " + info2.code + " is " + info2.name);
        

    }
}