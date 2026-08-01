import java.util.Scanner;

public class absolute {
    static void absolutenumber(int num) {
        if (num < 0) {
            System.out.println(-num);
        } else {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        absolutenumber(-10);
    }
}
