
import java.util.Scanner;
public class sample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        float r=sc.nextFloat();
        double area=3.14*r*r;
        System.out.println("Area of Circle = "+area);
    }
}
