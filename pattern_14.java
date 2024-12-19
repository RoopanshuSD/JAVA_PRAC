package JAVA_PRAC;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        while (row<=2*n-1) {
            if (row<=n) {
                int i = 1;
                int k = 1;
                while (i<=space) {
                    System.out.print("  ");
                    i++;
                }
                space--;
                while (k<=star) {
                    System.out.print("* ");
                    k++;
                }
                star++;
            }
            else{
                int i = 1;
                int k = 1;
                while (i<=space+2) {
                    System.out.print("  ");
                    i++;
                }
                space++;
                while (k<=star-2) {
                    System.out.print("* ");
                    k++;
                }
                star--;
            }
            System.out.println();
            row++;
        }
    }
}
