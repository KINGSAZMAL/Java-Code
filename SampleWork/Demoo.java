import java.util.Scanner;

public class Demoo {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the nth prime number
    public static int findNthPrime(int n) {
        int count = 0;
        int number = 1;

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the position of the prime number
        System.out.print("Enter the position of the prime number: ");
        int n = scanner.nextInt();

        // Find the nth prime number
        int nthPrime = findNthPrime(n);

        // Output the nth prime number
        System.out.println("The " + n + "th prime number is: " + nthPrime);

        scanner.close();
    }
}