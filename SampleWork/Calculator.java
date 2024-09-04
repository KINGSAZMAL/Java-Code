
import java.util.Scanner;

class Calculation{
    int add(int a,int b){
        int c;
        c=a+b;
        return c;
    }

    int sub(int a,int b){
        int c=a-b;
        return c;
    }

    int mul(int a,int b){
        int c=a*b;
        return c;
    }

    int div(int a,int b){
        int c=a/b;
        return c;
    }


}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculation s1=new Calculation();
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=s1.add(a,b);
        int result1=s1.sub(a,b);
        int result2=s1.mul(a,b);
        int result3=s1.div(a,b);
        System.out.println("Addition ="+result);
        System.out.println("Subtrsction ="+result1);
        System.out.println("Multiplication ="+result2);
        System.out.println("Division ="+result3);
        
    }
}
