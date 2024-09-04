
import java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to Check Palindrome");
        int n =sc.nextInt();
        int x=0;
        int m=n;
        int r;
        while(n!=0){
            r=n%10;
            x=(x*10)+r;
            n=n/10;
        }
        if(m==x){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}