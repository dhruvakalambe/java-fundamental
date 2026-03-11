package basic.loops.implement;
import java.util.*;

public class tables {
    public static void main(String[] args) {
        int a,b,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        a = sc.nextInt();
        System.out.println("Enter Number of Multiples of the number you want: ");
        b = sc.nextInt();
        for (i=1;i<=b;i++) {
            System.out.println(a+" times of "+i+" is "+a*i);
        }
    }
}
