import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];

        // 1. 정보 입력받기
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new Person(name, height, weight);
        }

        // 2. 키(height) 기준 오름차순 정렬
        Arrays.sort(people, Comparator.comparingInt(p -> p.height));

        // 3. 정렬된 결과 출력
        for (int i = 0; i < n; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight);
        }
    }
}