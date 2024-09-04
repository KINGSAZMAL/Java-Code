
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]%2==0)
            count++;
        }
        if(count==n){
            System.out.println("Even order Array");
        }
        else{
            System.out.println("Not Even Order");
        }
    }
}

