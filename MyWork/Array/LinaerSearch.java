
import java.util.Scanner;

public class LinaerSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int N=sc.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("Enter Element to be searched");
        int x=sc.nextInt();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("Total Number of Element Present is ="+count);

    }
}
