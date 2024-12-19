package JAVA_PRAC;

import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int n = roop.nextInt();
        int row = 1;
        int space = 0;
        int star = n;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print("    ");
                i++;
            }
            int k = 1;
            while (k<=star) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            space++;
            star--;
            row++;
        }
    }
}
