import java.util.Scanner;

public class PairInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("Enter thr Array Element = ");
        for(i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        //without Same Number like (1,1) (2,2) (3,3)
        //without Same Duplicates 
        for(i=0;i<=a.length-1;i++){
            for(j=0;j<=a.length-1;j++){
                if(i!=j){
                    System.out.print(a[i]+","+a[j]+" ");
                }
            }
        }

    }
}
