package JAVA_PRAC;

import java.util.Scanner;

public class pattern_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int num = 1;
        int space = n-1;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            if (row>=2) {
                int k =1;
                while (k<=num) {
                    if (k ==  1 || k == num) {
                        System.out.print(row+" ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                    k++;
                }
            }
            else {
                System.out.print("1 ");
            }                     
            space--;
            num+=2;
            row++;
            System.out.println();
        }
    }
}
