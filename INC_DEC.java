package JAVA_PRAC;

public class INC_DEC {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println(++a); //pre inc 10 will print
        System.out.println(a);// a becoms 10
        //System.out.println(a++);//post inc 9 will print
        //System.out.println(a); // 10 will print
        int c = a++ - b++ - b-- + a++;
        System.out.println(c);
        System.out.println(b);
    }
}
