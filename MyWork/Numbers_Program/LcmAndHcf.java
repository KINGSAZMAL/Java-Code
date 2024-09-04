
import java.util.Scanner;

public class LcmAndHcf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hcf = 0;
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is = " + hcf);

        int lcm;
        lcm = (a * b) / hcf;
        System.out.println("LCM of " + a + " and " + b + " is = " + lcm);

    }

}
