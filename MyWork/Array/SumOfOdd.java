
import java.util.Scanner;

class SumOfOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int N=sc.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of odd numbers : "+sum);
    }      
}