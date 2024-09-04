
import java.util.Scanner;

public class bubblesort2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int N=sc.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter Array Element");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-2;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];

        
        }   
        }
    }
        System.out.println("Sorted Array is");
        for(int i=0;i<=arr.length-1;i++){
         System.out.print(" "+arr[i]);   
        }
    }
}

