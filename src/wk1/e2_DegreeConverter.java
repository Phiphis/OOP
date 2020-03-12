package wk1;

import java.util.Scanner;

public class e2_DegreeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a temperature in Celcius to be converted: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }
}
