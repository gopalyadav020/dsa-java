import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("number is composite");
            }
        }
    }

}
