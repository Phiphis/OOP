package wk2;

import java.util.Scanner;

public class e1_YearAndMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        int days = 0;
        switch(month) {
            case "Jan":
                days = 31;
                break;
            case "Feb":
                days = 28;
                break;
            case "Mar":
                days = 31;
                break;
            case "Apr":
                days = 30;
                break;
            case "May":
                days = 31;
                break;
            case "Jun":
                days = 30;
                break;
            case "Jul":
                days = 31;
                break;
            case "Aug":
                days = 31;
                break;
        }

        System.out.printf("%s %d has %d days", month, year, days);

    }
}
