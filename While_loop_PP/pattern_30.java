package JAVA_PRAC;

import java.util.Scanner;

public class pattern_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        while (row<=n) {
            int num = n;
            int i =1;
            while (i<=n) {
                System.out.print(num+" ");
                i++;
                num--;
            }
            System.out.println();
            row++;
        }
    }
}
