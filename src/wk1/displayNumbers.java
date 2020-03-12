package wk1;

import java.util.Scanner;

public class displayNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 15: ");
        byte lines = input.nextByte();

        // Prints the pyramid
        for(int rows = 0; rows < lines; rows++){
            // Prints the tabs before the numbers
            for(int tabs = 0; tabs < lines-rows; tabs++) {
                System.out.print("\t");
            }

            // Prints the decreasing numbers
            for(int decrease = rows + 1; decrease > 0; decrease--) {
                System.out.printf("%d\t", decrease);
            }

            // Prints the increasing numbers
            for (int increase = 2; increase < rows + 2; increase++) {
                System.out.printf("%d\t", increase);
            }
            System.out.println("\n");
        }

    }
}
