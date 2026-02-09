package basic.operatorandcontrolflow;
import java.util.*;
public class ifel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,option;
        double output;
        System.out.println("Enter any three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Enter any of the operations tou want to perform:\n1)Addition\n 2)Subtraction\n 3)Multiplication\n 4)Division");
        option = sc.nextInt();
        if (option==1){
            output = a+b+c;
            System.out.println("Addition of those number are: "+output);
        }
        else if (option==2){
            output = a-b-c;
            System.out.println("Subtraction of those number are: "+output);
        }
        else if (option==3){
            output = a*b*c;
            System.out.println("Multiplication of those number are: "+output);
        }
        else if (option==4){
            output= a/b/c;
            System.out.println("Division of those number are: "+output);
        }
        else{
            System.out.println("Error: Option selected is out of bounds!!");
        }
    }
}
