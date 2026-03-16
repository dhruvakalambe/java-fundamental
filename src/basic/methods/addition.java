package basic.methods;
import java.util.*;

public class addition {
    float add(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number decimals are also acceptable 👍:\n");
        float a = sc.nextFloat();
        System.out.println("Enter another number:\n");
        float b = sc.nextFloat();
        System.out.println("Sum using function");
        //creating an object of the class to call the 'add' method
        addition obj = new addition();
        //store the returned value in a variable and call the method via object
        float sum = obj.add(a,b);
        System.out.println("The sum of these 2 numbers is -\n"+a+"+"+b+"="+sum);
    }
}
