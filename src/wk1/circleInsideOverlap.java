package wk1;

import java.util.Scanner;

public class circleInsideOverlap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter center x-, y-coordinates and radius of the first circle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        System.out.println("Enter center x-, y-coordinates and radius of the second circle: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
    }
}
