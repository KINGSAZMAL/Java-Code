
import java.util.Scanner;

public class PairInArrayWithDuplication {
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
        System.out.println("Enter the Sum");
        int sum=sc.nextInt();
        for(i=0;i<=a.length-1;i++){
            for(j=0;j<=a.length-1;j++){
                if(a[i]+a[j]==sum){
                    System.out.print(a[i]+","+a[j]+" ");
                }

            }
        }
    }
}
