package JAVA_PRAC;
import java.util.*;
/*OR we can write as import java.util.Scanner to import only Scanner file.
 * basicallt used to import allthe file in util. */
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int s =(p*r*t)/100;
        /*
         * p/100 will give 0 if p < 100.
         * hence in division always divide in last to avoid this
         */
        System.out.println(s);
    }
}
