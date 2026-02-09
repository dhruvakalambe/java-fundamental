package basic.operatorandcontrolflow;
import java.util.*;
public class eveoddswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check if even or odd: ");
        int n = sc.nextInt();
        int a = n%2;
        switch (a){
            case 0:
                System.out.println("The number you entered is even ie "+n+"/2 gives "+a);
                break;
            case 1:
                System.out.println("The number you entered is odd ie "+n+"/2 gives "+a);
                break;
            default:
                System.out.println("The number you entered excceds the range or the answer cannot be determined :(");
        }
    }
}
