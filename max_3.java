package JAVA_PRAC;

import java.util.Scanner;

public class max_3 {
    public static void main(String[] args) {
        Scanner roop = new Scanner(System.in);
        int a = roop.nextInt();
        int b = roop.nextInt();
        int c = roop.nextInt();
        roop.close();
        if (a >= b && a >= c) {
            System.out.println("a is max");
        } else if (b >= a && b >= c) {
                System.out.println("b is max");
            } else {
                System.out.println("c is max");
            }

    }

}
