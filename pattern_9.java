package JAVA_PRAC;

import java.util.Scanner;

public class pattern_9 {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int n = roop.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row<=n){
            int k = 1;
            while (k<=space) {
                System.out.print("  ");
                k++;
            }
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println();
            star+=2;
            space--;
        }

    }
}
