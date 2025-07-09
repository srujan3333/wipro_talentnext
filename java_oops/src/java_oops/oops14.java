package java_oops;
import java.util.Scanner;

public class oops14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (input.length() > 0 && input.charAt(0) == 'x') {
            input = input.substring(1);
        }

        if (input.length() > 0 && input.charAt(input.length() - 1) == 'x') {
            input = input.substring(0, input.length() - 1);
        }

        System.out.println("Output: " + input);

        sc.close();
    }
}
