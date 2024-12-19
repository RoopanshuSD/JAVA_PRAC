package JAVA_PRAC;

import java.util.Scanner;

public class pattern_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int space = n-1;
        int num = 1;
        int a = 1;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print("   ");
                i++;
            }
            int k = 1;
            while (k<=num) {
                if (a<10) {
                    System.out.print(a+"  ");
                }
                else{
                    System.out.print(a+" "); 
                }
                
                k++;
                a++;
            }
            System.out.println();
            row++;
            space--;
            num+=2;
        }
    }
}
