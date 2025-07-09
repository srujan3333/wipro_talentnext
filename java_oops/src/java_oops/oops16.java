package java_oops;
import java.util.Scanner;
public class oops16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        }

        if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        System.out.println("Output: " + result.toString());
        sc.close();
    }
}
