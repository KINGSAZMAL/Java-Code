
import java.util.Scanner;

public class ReverseString1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String n_str = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            n_str = ch + n_str;
        }
        System.out.println(n_str);

    }
}
