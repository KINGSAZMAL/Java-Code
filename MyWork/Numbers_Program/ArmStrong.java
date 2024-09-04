
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number");
            int N=sc.nextInt();
            int copy=N;
            int y=0; 
            while(N!=0){
                N=N/10;
                y++;
            }
            N=copy;
            int x;int result=0;
            while(N!=0){
                x=N%10;
                N=N/10;
                
                int pow=1;
                for(int i=1;i<=y;i++){
                    pow=pow*x;
                }
                result=result+pow;
            }
            if(copy==result){
                System.out.println("ArmStrong Number");
            }
            else{
                System.out.println("Not ArmStrong Number");
            }
    }
    
}
