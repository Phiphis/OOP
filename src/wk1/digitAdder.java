package wk1;

import java.util.Scanner;

public class digitAdder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a positive integer: ");
        int sum = 0;
        int num = input.nextInt();
        while (num > 0) {
            sum += num%10;
            num /= 10;
        }
        System.out.println("The sum of the digits is " + sum);

    }
}
