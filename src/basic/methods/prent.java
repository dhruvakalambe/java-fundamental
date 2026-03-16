package basic.methods;
import java.util.*;

public class prent {
    static void shout(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any line:\n");
        String s = sc.nextLine();
        System.out.println("Line will be repeated using a function :)");
        shout(s);
    }
}
