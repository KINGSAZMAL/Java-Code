
import java.util.Scanner;

class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter No of Rotation to perform :");
        int n = sc.nextInt();
        ArrayOperation ao = new ArrayOperation();
        ao.rotate(a, n, size);
    }
}

class ArrayOperation {

    public void rotate(int a[], int n, int size) {
        if (n > size) {
            n = n % size;
        }
        int res[] = new int[size];
        for (int i = 0; i < n; i++) {
            res[i] = a[size - n + i];
        }
        int j = 0;
        for (int i = n; i < size; i++) {
            res[i] = a[j];
            j++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
