package java_abstraction;

import java.util.Scanner;

public class abs10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = new int[5];
            int sum = 0;

            System.out.println("Enter 5 integers:");
            for (int i = 0; i < 5; i++) {
                String input = sc.nextLine();
                arr[i] = Integer.parseInt(input);
                sum += arr[i];
            }

            double average = sum / 5.0;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        sc.close();
    }
}
