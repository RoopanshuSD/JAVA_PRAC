package JAVA_PRAC;

import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int star = 1;
        while (row<=2*n-1) {
            if (row<=n) {
                int i = 1;
                while (i<=star) {
                    System.out.print("* ");
                    i++;
                }
                star++;
            }
            else{
                int i = 1;
                while (i<=star-2) {
                    System.out.print("* ");
                    i++;
                }
                star--;
            }
            System.out.println();
            row++;
        }
    }
        
}

