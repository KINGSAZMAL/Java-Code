
import java.util.Scanner;

public class ZeroToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for(int j=0;j<=a.length-1;j++){
        for(i=0;i<=a.length-2;i++){
            if(a[i]==0){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
}
        for(i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
