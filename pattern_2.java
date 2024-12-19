package JAVA_PRAC;
import java.util.Scanner;
public class pattern_2 {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int n = roop.nextInt();
        roop.close();
        int row = 1;
        int star = 1;
        while (row<=n) {
            int i =1;
            while (i<=star) {
                System.out.print("* ");
                i++;
           
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
