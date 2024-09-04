import java.util.Scanner;

public class MathChallenge {
    // Function to encrypt the text
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the text
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Input the shift number
        System.out.print("Enter the shift number: ");
        int shift = scanner.nextInt();

        // Encrypt the text
        String encryptedText = encrypt(text, shift);

        // Output the encrypted text
        System.out.println("Encrypted text: " + encryptedText);

        scanner.close();
    }
}