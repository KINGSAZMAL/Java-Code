
import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the index Number");
        int index=sc.nextInt();
        int i;
        int sumofleft=0;
        int sumofright=0;
        for(i=0;i<index;i++){
            sumofleft=sumofleft+a[i];
        }
        for(i=index+1;i<=a.length-1;i++){
            sumofright=sumofright+a[i];
        }
        if(sumofright==sumofleft){
            System.out.println("Array is Balanced");
        }
        else{
            System.out.println("Array is Not Balanced");
        }
    }
}
