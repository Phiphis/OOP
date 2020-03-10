package wk1;

public class displayTable {
    public static void main(String[] args) {
        //System.out.printf("Hello %d%n, miles*1.609);
        double[] miles = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
        for (double mile : miles) {
            System.out.printf(mile + "      %d%n", mile*1.609);
        }
    }
}
