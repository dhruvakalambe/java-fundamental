package basic.array;
import java.util.*;
public class sumaverage {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values you want to enter:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values to be entered in the array:\n");
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        //only using float avg the result will be converted to float but if we use (float) the float value of sum/n is saved
        float avg = (float)sum/n;

        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}
