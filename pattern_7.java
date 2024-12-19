package JAVA_PRAC;

import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int n = roop.nextInt();
        roop.close();
        int i = 1;
        while (i <= n) {
            System.out.print("* ");
            i++;
        }
        System.out.println();
        int row = 1;
        while (row <= n - 2) {
            System.out.print("* ");
            int k = 1;
            while (k <= n - 2) {
                System.out.print("  ");
                k++;
            }
            System.out.print("* ");
            System.out.println();
            row++;
        }
        int j = 1;
        while (j <= n) {
            System.out.print("* ");
            j++;
        }
    }
}
