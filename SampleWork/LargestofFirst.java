
import java.util.Scanner;

public class LargestofFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }

        // Create a new array to store the results
        int[] result = new int[n];

        // First element - check largest of first and second
        if (arr[0] > arr[1]) {
            result[0] = arr[0];
        } else {
            result[0] = arr[1];
        }

        // Update every element with the largest of previous and next elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] > arr[i + 1]) {
                result[i] = arr[i - 1];
            } else {
                result[i] = arr[i + 1];
            }
        }

        // Last element - check largest of last and second last
        if (arr[n - 1] > arr[n - 2]) {
            result[n - 1] = arr[n - 1];
        } else {
            result[n - 1] = arr[n - 2];
        }

        // Print the result array
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


