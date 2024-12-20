package JAVA_PRAC;

import java.util.Scanner;

public class pattern_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int star = 1;
        int space = n-1;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int k = 1;
            while (k<=star) {
                System.out.print("1 ");
                k++;
            }
            star+=2;
            space--;
            System.out.println();
            row++;
        }
    }
}
