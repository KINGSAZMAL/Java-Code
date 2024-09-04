
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size number ");
        int a  = sc.nextInt();
        int arr[]=new int[a];
        for(int i=0; i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("Sum of the array element");
        for(int i=0; i<=arr.length-1;i++){
            sum+=arr[i];
            
        }
        System.out.println(sum);
    }
}
