import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        j=0;
        for( i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Element to Remove from Array");
        int x=sc.nextInt();
        for(i=0;i<=a.length-1;i++){
            if(a[i]==x){
                a[i]=0;
            }
        }
        for(i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
