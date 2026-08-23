import java.util.Scanner;

class Info {
    String name;
    String address;
    String region;

    public Info(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] info = new Info[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            info[i] = new Info(name, address, region);
        }

        // 사전순으로 가장 뒤에 오는 사람의 인덱스 찾기
        int maxIdx = 0;
        for (int i = 1; i < n; i++) {
            // info[i].name이 현재 maxIdx의 name보다 사전순으로 뒤에 있으면 양수 반환
            if (info[i].name.compareTo(info[maxIdx].name) > 0) {
                maxIdx = i;
            }
        }

        // 결과 출력 (city 라벨에 유의)
        System.out.println("name " + info[maxIdx].name);
        System.out.println("addr " + info[maxIdx].address);
        System.out.println("city " + info[maxIdx].region);
    }
}