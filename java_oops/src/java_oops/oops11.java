package java_oops;
import java.util.Scanner;
public class oops11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (input.length() % 2 == 0) {
            String result = input.substring(0, input.length() / 2);
            System.out.println("Output: " + result);
        } else {
            System.out.println("Output: null");
        }

        sc.close();
    }
}
