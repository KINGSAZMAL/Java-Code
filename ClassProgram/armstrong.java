
import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int m=n;
        int i;
        int result=0;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        n=m;
        int x;
        while(n!=0){
            x=n%10;
            n=n/10;
            int pow=1;
            
            for(i=1;i<=count;i++){
                pow=pow*x;
            }
            result=result+pow;
        }
        if(m==result){
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }

    }
}