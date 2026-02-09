package basic.operatorandcontrolflow;
import java.util.*;
public class switchlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three Numbers:\n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if (a>b&&a>c){
            largest=1;
        }
        else if (a<b&&b>c){
            largest=2;
        }
        else {
            largest=3;
        }
        switch(largest){
            case 1:
                System.out.println("Your 1st value entered is largest ie "+a);
                break;
            case 2:
                System.out.println("Your 2nd value entered is largest ie "+b);
                break;
            case 3:
                System.out.println("Your 3rd value entered is largest ie "+c);
                break;
            default:
                System.out.println("You messed up the code kaz :(");
        }
    }
}
