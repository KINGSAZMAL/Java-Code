import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENetr the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enetr array element");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
