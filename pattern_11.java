package JAVA_PRAC;

import java.util.Scanner;

public class pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        while (row<=n) {
            int i =1;
            while (i<=space) {
                System.out.print("   ");
                i++;
            }
            int k = 1;
            while (k<=star) {
                System.out.print("*     ");
                k++;
            }
            System.out.println();
            row++;
            space--;
            star++;
        }
    }
}