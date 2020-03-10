package wk1;

import java.util.Formatter;

public class displayTable {
    public static void main(String[] args) {
        //System.out.printf("Hello %d%n, miles*1.609);
        int[] miles = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Miles   Kilometer   |   Kilometers  Miles");
        for (int mile : miles) {
            System.out.printf(" %d \t\t %.2f \t\t|\t\t%d \t\t%.2f%n", mile, mile*1.609, 20+(mile-1)*5, (20+(mile-1)*5)/1.609);
        }
    }
}
