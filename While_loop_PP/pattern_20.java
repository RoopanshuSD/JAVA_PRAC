package JAVA_PRAC;

import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int space_1 = (n-1)/2;
        int space_2 = -1;
        while (row<=n) {
            if (row<=(n+1)/2) {
                int i = 1;
                while (i<=space_1) {
                    System.out.print("  ");
                    i++;
                }
                System.out.print("* ");
                i =1;
                while (i<=space_2) {
                    System.out.print("  ");
                    i++;
                }
                if (row==1) {
                    System.out.print("");
                }
                else {
                    System.out.print("* ");
                }
                
                space_1--;
                space_2+=2;
            }
            else {
                int i = 1;
                while (i<=space_1+2) {
                    System.out.print("  ");
                    i++;
                }
                System.out.print("* ");
                i =1;
                while (i<=space_2-4) {
                    System.out.print("  ");
                    i++;
                }
                if (row==n) {
                    System.out.print("");
                }
                else {
                    System.out.print("* ");
                }
                space_1++;
                space_2-=2;
            }
            System.out.println();
            row++;
        }
    }
}
