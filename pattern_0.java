package JAVA_PRAC;
import java.util.Scanner;

public class pattern_0 {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int n = roop.nextInt();
        roop.close();
        int k = 1;
        while (k<=n) {
            System.out.print("* ");
            k++;
        }
    }
}
