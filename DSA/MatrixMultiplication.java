
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int n = sc.nextInt();
        int max1[][] = new int[n][n];
        int max2[][] = new int[n][n];
        System.out.println("Enter the 1st Array Elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the 2nd Array Elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max2[i][j] = sc.nextInt();
            }
        }
        int res[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    res[i][j] = max1[i][j] + (max1[i][k] * max2[j][k]);
                }
                System.out.println(res[i][j] + " ");
            }
        }
    }
}
