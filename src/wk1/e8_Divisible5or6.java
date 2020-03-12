package wk1;

import java.util.Scanner;

public class e8_Divisible5or6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.print(num);
        if (num % 5 == 0 || num % 6 == 0) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.println(" is divisible by both 5 and 6");
            } else {
                System.out.println(" is divisible by 5 or 6, but not both");
            }
        } else {
            System.out.println(" is not divisible by neither 5 or 6");
        }

    }
}
