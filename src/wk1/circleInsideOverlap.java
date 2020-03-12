package wk1;

import java.util.Scanner;

public class circleInsideOverlap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter center x-, y-coordinates and radius of the first circle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.println("Enter center x-, y-coordinates and radius of the second circle: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1-r2)) {
            System.out.println("Circle2 is inside Circle1");
        } else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= (r1 + r2)) {
            System.out.println("Circle2 overlaps Circle1");
        } else {
            System.out.println("Circle2 does not overlap Circle1");
        }
    }
}
