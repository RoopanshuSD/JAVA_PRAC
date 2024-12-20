package JAVA_PRAC;

import java.util.Scanner;

public class pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while (row<=n) {
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            int k = 1;
            while (k<=space) {
                System.out.print("  ");
                k++;
            }
            if (star==n) {
                i = 1;
                while (i<=star-1) {
                    System.out.print("* ");
                    i++;
                }
            }
            else {
                i = 1;
                while (i<=star) {
                    System.out.print("* ");
                    i++;
                }
            }
            System.out.println();
            row++;
            star++;
            space-=2;

        }
        }
}
