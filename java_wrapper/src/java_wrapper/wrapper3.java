package java_wrapper;

import java.util.Scanner;

public class wrapper3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (1 to 255): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid input. Number must be between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(number);
            String paddedBinary = String.format("%8s", binary).replace(' ', '0');
            System.out.println(paddedBinary);
        }

        scanner.close();
    }
}
