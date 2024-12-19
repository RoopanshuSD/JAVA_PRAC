package JAVA_PRAC;
import java.util.Scanner;
public class pattern_4 {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int n = roop.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        while (row<=n) {
            int i = 1;
            int k = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            while (k<=star) {
                System.out.print("* ");
                k++;
            }
        row++;
        space--;
        star++;
        System.out.println();    
        }
    }
}
