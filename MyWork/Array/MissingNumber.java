
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size");
        int n=sc.nextInt();
        int a[]=new int[n-1];
        System.out.println("Enter "+(n-1)+" array element");
        for(int i=0;i<=n-2;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        int suma=0;

        int len=a.length-1;

        for(int i=a[0];i<=a[len];i++){ //Sum of First N Natural Number
            sum=sum+i;
        }

        for(int j=0;j<=a.length-1;j++){ //Sum of all Element in array
            suma=suma+a[j];
        }
        System.out.println("Missing Number= "+(sum-suma));
    }
}
