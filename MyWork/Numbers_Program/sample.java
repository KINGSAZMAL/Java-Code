
import java.util.*;
public class sample {

    public static void main(String[] args) {
        int a,b,c;
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter number A:");
        a=ab.nextInt();
        System.out.print("Enter number B:");
        b=ab.nextInt();
        c=Sum(a,b);
        System.out.println("Sum of "+a+" and "+b+" = "+c);
    }
    public static int Sum(int d,int e) {
        int sum=d+e;
        return sum;
    }
}