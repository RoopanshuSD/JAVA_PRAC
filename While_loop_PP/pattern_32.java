package JAVA_PRAC;

import java.util.Scanner;

public class pattern_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int num = 1;
        while (row<=2*n-1) {
            int i = 1;
            while (i<=num) {
                if (i%2 == 0) {
                    System.out.print("* ");
                }
                else{
                    System.out.print(row+" ");
                }
                i++;
            }
            if (row <= n-1) {
                num+=2;
            }
            else{
                num-=2;
            }
            System.out.println();
            row++;
        }
    }
}
