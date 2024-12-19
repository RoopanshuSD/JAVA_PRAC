package JAVA_PRAC;

import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int space = (n-1)/2;
        int star = 1;
        while (row<=n) {
            if (row<=(n+1)/2) {
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
                star+=2;
            }
            else{
                int i = 1;
                while (i<=space+2) {
                    System.out.print("  ");
                    i++;
                }
                space++;
                int k = 1;
                while (k<=star-4) {
                   System.out.print("* ");
                   k++; 
                }
                star-=2;
            }
            System.out.println();
            row++;
        }
    }
}
