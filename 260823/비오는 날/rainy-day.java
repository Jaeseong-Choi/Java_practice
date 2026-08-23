import java.util.Scanner;

class Info {
    String date;
    String day;
    String weather;

    public Info (String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather; 
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Info[] info = new Info[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            info[i] = new Info(date, day, weather);
        }
        
        int minIdx = -1; 

        for(int i = 0; i < n; i++) {
            if (info[i].weather.equals("Rain")) {
                if (minIdx == -1 || info[i].date.compareTo(info[minIdx].date) < 0) {
                    minIdx = i;
                }
            }
        }

        System.out.println(info[minIdx].date + " " + info[minIdx].day + " " + info[minIdx].weather);
    }
}