
import java.util.Scanner;

public class ArrayPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (a[i] % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(a[i] + " ");
            }
        }
    }
}
