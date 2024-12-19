package JAVA_PRAC;

import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int star = (n+1)/2;
        int space = -1;
        while (row<=n){
          if (row<=(n+1)/2) {
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            int j =1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            if (row==1) {
                i=1;
                while (i<=star-1) {
                    System.out.print("* ");
                    i++;
                }
            }
            else{
                i=1;
                while (i<=star) {
                    System.out.print("* ");
                    i++;
                }
            }
            star--;
            space+=2;
          }
          else{
            int i = 1;
            while (i<=star+2) {
                System.out.print("* ");
                i++;
            }
            int j =1;
            while (j<=space-4) {
                System.out.print("  ");
                j++;
            }
            if (row==n) {
                i=1;
                while (i<=star+1) {
                    System.out.print("* ");
                    i++;
                }
            }
            else{
                i=1;
                while (i<=star+2) {
                    System.out.print("* ");
                    i++;
                }
            }
            star++;
            space-=2;
          }
          System.out.println();
          row++;  
        }

    }
}
