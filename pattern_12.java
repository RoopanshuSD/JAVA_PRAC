package JAVA_PRAC;
import java.util.Scanner;
public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int space = n-1;
        //int set = 0;
        int star = 1;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            //System.out.print("* ");
            int k = 1;
            while (k<=star) {
                if (k%2==0) {
                    System.out.print("! ");
                    
                }
                else{
                    System.out.print("* ");
                    
                }
                k++;
                
            }
            System.out.println();
            row++;
            space--;
            star+=2;   
            
        }
    }
}
