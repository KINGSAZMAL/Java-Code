
import java.util.Scanner;

class MergeSortAlgorithm {

    void merge(int arr[], int initial, int mid, int last) {
        int n1 = mid - initial + 1;
        int n2 = last - mid;
//create the temp arrays
        int leftarray[] = new int[n1];
        int rightarray[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftarray[i] = arr[initial + i];
        }
        for (int i = 0; i < n2; i++) {
            rightarray[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = initial;

        while (i < n1 && j < n2) {
            if (leftarray[i] <= rightarray[j]) {
                arr[k] = leftarray[i];
                i++;
            } else {
                arr[k] = rightarray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftarray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightarray[j];
            j++;
            k++;
        }
    }

    void mergeSort(int arr[], int initial, int last) {
        if (initial < last) {
            int mid = (initial + last) / 2;
            mergeSort(arr, initial, mid);
            mergeSort(arr, mid + 1, last);
            merge(arr, initial, mid, last);
        }
    }

}

public class MergeSortAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then size of the array: ");
        int size = sc.nextInt();
        //create the array:
        int arr[] = new int[size];

        //collecting array data:
        System.out.println("Enter the array data: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
//displaying the unsorted array:
        System.out.println("The unsorted array is :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        MergeSortAlgorithm msa = new MergeSortAlgorithm();
        msa.mergeSort(arr, 0, size - 1);
        System.out.println("The sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
