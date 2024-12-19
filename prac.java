package JAVA_PRAC;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int n = roop.nextInt();
        int row = 1;
        while (row == 1 || row == n) {
            int i = 1;
            while (i<=n) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
        while(row!=1 && row!=n) {
            while (row<=n-2) {
                System.out.print("* ");
                int k = 1;
                while (k<=n-2) {
                    System.out.print("  ");
                    k++;
                }
                System.out.print("* ");
                System.out.println();
                row++;
            }
        }
    }
}

