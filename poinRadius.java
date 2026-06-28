import java.util.Scanner;

public class poinRadius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter center of (x,y)");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("enter center of (X,y1)");
        int X = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("enter radius");
        int r = sc.nextInt();
        int distanceSquare = (x - X) * (x - X) + (y - y1) * (y - y1);
        int radiusSquare = r * r;
        if (distanceSquare < radiusSquare) {
            System.out.println("point inside a circle");
        } else if (distanceSquare == radiusSquare) {
            System.out.println("point is on the circle");
        } else {
            System.out.println("point outside a circle");
        }

    }

}
