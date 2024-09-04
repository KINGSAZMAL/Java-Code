
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a array size");
        int N=input.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter Array Element");
        for (int i = 0; i <=arr.length-1; i++) {
            arr[i]=input.nextInt();
            
        }
        int max = 0;
        int min=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Largest="+max);
        System.out.println("Smallest="+min);
        
        
    }
}
