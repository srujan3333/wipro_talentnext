package java_wrapper;

import java.util.Scanner;

public class wrapper2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        int num = scanner.nextInt();

        System.out.println("Given Number :" + num);
        System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
        System.out.println("Octal equivalent :" + Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num).toUpperCase());

        scanner.close();
    }
}
