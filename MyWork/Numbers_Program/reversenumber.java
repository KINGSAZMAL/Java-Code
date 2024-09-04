package Numbers_Program;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int x=0;
       while(n!=0){
        int r=n%10;
        x=(x*10)+r;
        n=n/10;
       }
       System.out.println("The Reverse Number is "+x);
    }
}
