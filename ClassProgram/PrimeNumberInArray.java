
import java.util.Scanner;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("Enter thr Array Element ");
        for(i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Prime Numbers are");
        for(i=0;i<=a.length-1;i++){
            Prime(a[i]);
        }
    }

    public static void Prime(int n) {
        int count=0;
        int i;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" ");
        }
        
    }
}
