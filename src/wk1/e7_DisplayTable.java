package wk1;

import java.util.Formatter;

public class e7_DisplayTable {
    public static void main(String[] args) {
        final double CONVERSION_RATE = 1.609;
        int[] miles = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Miles\tKilometer\t|\tKilometers\tMiles");
        for (int mile : miles) {
            System.out.printf("%2d\t\t %5.2f \t\t|\t\t%d \t\t%.2f%n",
                    mile, mile * CONVERSION_RATE, 20 + (mile -1 ) * 5, (20 + (mile - 1) * 5) / CONVERSION_RATE);
        }
    }
}
// Notice how the formats and white space works