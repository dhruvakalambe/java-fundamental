package basic.array;
import java.util.*;

public class iparray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter values to be entered in the array:\n");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Entered values for the array are:\n");
        for (int j=0; j<5; j++){
            System.out.println(arr[j]);
        }
    }
}
