package basic.array;
import java.util.Scanner;
public class twod {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered 2D array is:\n");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(mat[i][j]);
            }
        }
    }
}
