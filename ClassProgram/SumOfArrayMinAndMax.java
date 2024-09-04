
import java.util.Scanner;

class SumOfArrayMinAndMax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int min=0;
        int temp;
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a.length-2;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=a.length-2;i++){
            min=min+a[i];
        }
        System.out.println("Min Sum = "+ min);

        for(int i=1;i<=a.length-1;i++){
            max=max+a[i];
        }
        System.out.println("Max Sum = "+max);
    }
}