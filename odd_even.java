package JAVA_PRAC;
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int a = roop.nextInt();
        roop.close();
        if(a%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
}
