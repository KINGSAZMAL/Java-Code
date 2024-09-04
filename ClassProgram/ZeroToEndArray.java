
import java.util.Scanner;

 class ZeroToEndArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        j=0;
        for( i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<=a.length-1;i++){
            if(a[i]!=0){
                a[j]=a[i];
                j++;
            }
           
        }
        while(j<=a.length-1){
            a[j]=0;
            j++;
        }
        for( i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
