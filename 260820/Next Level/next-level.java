import java.util.Scanner;

class nextLevel {
    String id;
    int level;

    public nextLevel() {
        this.id = "codetree";
        this.level = 10;
    }

    public nextLevel(String id, int level) {
        this.id = id; 
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        nextLevel nextlevel = new nextLevel();
        nextLevel nextlevel2 = new nextLevel(id, level);

        System.out.println("user " + nextlevel.id + " lv " + nextlevel.level);
        System.out.println("user " + nextlevel2.id + " lv " + nextlevel2.level);
        
    }
}