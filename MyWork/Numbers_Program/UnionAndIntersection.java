
import java.util.Scanner;

class unionArray {

    public void union(int n, int a[], int b[]) {
        int k = 0;
        int ressize = a.length + b.length;
        int res[] = new int[ressize];

        for (int i = 0; i < a.length; i++) {
            res[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (b[i] == res[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                res[k++] = b[i];
            }
        }
        System.out.println("Union of Array");
        for (int i = 0; i < k; i++) {
            System.out.println(res[i]);
        }
    }
}

class intersectionArray {

    void IntersectionArray(int n, int a[], int b[]) {
        int k = 0;
        int ressize = a.length + b.length;
        int res[] = new int[ressize];
        boolean present = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    res[k++] = b[j];
                    present = true;
                    break;
                } else {
                    present = false;
                }
            }
        }
        if (present == true) {
            System.out.println("Intersection of Array");
            for (int i = 0; i < k; i++) {
                System.out.println(res[i]);
            }
        } else {
            System.out.println("No Intersection Element in Array");
        }

    }
}

public class UnionAndIntersection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter Element for Array 1");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Element for Array 2");
        for (int j = 0; j < n; j++) {
            b[j] = sc.nextInt();
        }
        unionArray ua = new unionArray();
        ua.union(n, a, b);
        intersectionArray ia = new intersectionArray();
        ia.IntersectionArray(n, a, b);
    }
}
