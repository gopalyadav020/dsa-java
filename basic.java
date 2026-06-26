import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length");
        int length = sc.nextInt();
        System.out.println("enter a bredth");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("it is a square");
        } else {
            System.out.println("not a square");
        }

    }
}
