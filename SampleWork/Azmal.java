import java.util.Scanner;

public class Azmal{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = scanner.nextInt();
        scanner.close();

        int nthPrime = findNthPrime(num);
        System.out.println("The " + num + "th prime number is: " + nthPrime);
    }

    public static int findNthPrime(int num) {
        int count = 0;
        int candidate = 2;
        while (count < num) {
            if (isPrime(candidate)) {
                count++;
            }
            candidate++;
        }
        return candidate - 1;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
