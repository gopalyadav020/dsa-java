import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price");
        int cp = sc.nextInt();
        System.out.println("enter selling price");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println("you gained a profit");
        } else {
            System.out.println("you incurred a loss");
        }
    }

}
