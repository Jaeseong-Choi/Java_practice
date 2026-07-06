public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 1;
        int b = 2;
        int c = 3;
        
        int mul = a + b + c;

        a = mul;
        b = mul;
        c = mul; 

        System.out.println(a + " " + b + " " + c);
    }
}