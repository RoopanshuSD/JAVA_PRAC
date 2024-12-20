package JAVA_PRAC;

import java.util.Scanner;

public class pattern_28 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int num = 1;
        int space = n-1;
        while (row<=n) {
            int a = row;
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int k =1;
            while (k<=num) {
                System.out.print(a+" ");
                k++;
                if (k<=(num+1)/2) {
                    a++;
                }
                else{
                    a--;
                }
                
            }
            space--;
            num+=2;
            row++;
            System.out.println();

        } 
    }
}
