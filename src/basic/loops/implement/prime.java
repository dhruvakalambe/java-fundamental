package basic.loops.implement;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        int num, i = 2, j;
        boolean isPrime;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any number and we will see the prime numbers till then: ");
        num = s1.nextInt();
        do {
            isPrime = true;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);
    }
}