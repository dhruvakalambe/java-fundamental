package basic.input;
import java.sql.SQLOutput;
import java.util.Scanner;
public class alltype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name- ");
        String name = sc.next();
        System.out.println("Enter your age- ");
        int age = sc.nextInt();

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
    }
}