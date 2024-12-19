package JAVA_PRAC;

import java.util.Scanner;

public class pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int star = n;
        int space = -1;
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
            if (row==1) {
                i=1;
                while (i<=star-1) {
                    System.out.print("* ");
                    i++;
                }
            }
            else {
                i=1;
                while (i<= star) {
                    System.out.print("* ");
                    i++;
                }
            }
            star--;
            space+=2;
            System.out.println();
            row++;
        }
    }
}
