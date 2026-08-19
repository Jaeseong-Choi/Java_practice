import java.util.Scanner;

class Meeting {
    String secretCode;
    char meetingPoint;
    int time;

    public Meeting(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode; 
        this.meetingPoint = meetingPoint;
        this.time = time; 
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Meeting meeting = new Meeting(sCode, mPoint, time);

        System.out.println("secret code : " + meeting.secretCode);
        System.out.println("meeting point : " + meeting.meetingPoint);
        System.out.println("time : " + meeting.time);
    }
}