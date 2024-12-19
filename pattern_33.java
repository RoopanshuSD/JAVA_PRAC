package JAVA_PRAC;

import java.util.Scanner;

public class pattern_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int num = 1;
        int space = n-1;
        while (row<=n) {
            int a = n-1;
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int k =1;
            while (k<=num) {
                if (k == row) {
                    System.out.print("0 ");
                }
                else{
                    System.out.print(a+" ");
                }
                if (k<row) {
                    a--;
                }
                if(k>=row){
                    a++;
                }
                k++;
                
            }
            space--;
            num+=2;
            row++;
            System.out.println();

        }
    }
}
