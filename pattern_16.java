package JAVA_PRAC;

import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int space = n-1;
        int star = n;
        while (row<=2*n-1) {
            if (row<=n) {
                int i = 1;
                while (i<=space) {
                    System.out.print("  ");
                    i++;
                }
                space--;
                int k = 1;
                while (k<=star) {
                    System.out.print("* ");
                    k++;         
                }
                star--;
            }
            else{
                int i = 1;
                while (i<=space+2) {
                    System.out.print("  ");
                    i++;
                }
                space++;
                int k = 1;
                while (k<=star+2) {
                    System.out.print("* ");
                    k++;         
                }
                star++;
            }
            System.out.println();
            row++;
        }
    }
}
