import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to check where it is palindrome or not");
        int N=sc.nextInt();
        int x=0;
        int M=N;
        while(N!=0){
            int r=N%10;
            x=(x*10)+r;
            N=N/10;
        }
        if(x==M){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
        }
    }
