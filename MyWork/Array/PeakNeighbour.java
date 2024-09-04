
import java.util.Scanner;

public class PeakNeighbour {
   public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter array Size");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Array Element");
    for(int i=0;i<=a.length-1;i++){
        a[i]=sc.nextInt();
    }
    for(int i=1;i<=a.length-2;i++){
        if(a[i]>a[i+1] && a[i]>a[i-1]){
            System.out.print(a[i]+" ");
        }
    }
    System.out.println();

    }
}
