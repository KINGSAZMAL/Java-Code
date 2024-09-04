
import java.util.Scanner;

public class NegToLeftandPosToRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i,j;
        j=0;
        for( i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<=a.length-1;i++){
            if(a[i]>=0){
                b[j]=a[i];
                j++;
            }
        }
        for(i=0;i<=a.length-1;i++){
            if(a[i]<0){
                b[j]=a[i];
                j++;
            }
        }
        for( j=0;j<=b.length-1;j++){
            System.out.print(b[j]+" ");
    }
}
    
}
