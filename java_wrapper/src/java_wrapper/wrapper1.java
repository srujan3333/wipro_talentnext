package java_wrapper;

import java.util.Scanner;

public class wrapper1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the wrapper class name (Byte, Short, Integer, Long, Float, Double): ");
        String input = scanner.nextLine().trim();

        switch (input) {
            case "Byte":
                System.out.println("Byte range:");
                System.out.println("min: " + Byte.MIN_VALUE);
                System.out.println("max: " + Byte.MAX_VALUE);
                break;

            case "Short":
                System.out.println("Short range:");
                System.out.println("min: " + Short.MIN_VALUE);
                System.out.println("max: " + Short.MAX_VALUE);
                break;

            case "Integer":
                System.out.println("Integer range:");
                System.out.println("min: " + Integer.MIN_VALUE);
                System.out.println("max: " + Integer.MAX_VALUE);
                break;

            case "Long":
                System.out.println("Long range:");
                System.out.println("min: " + Long.MIN_VALUE);
                System.out.println("max: " + Long.MAX_VALUE);
                break;

            case "Float":
                System.out.println("Float range:");
                System.out.println("min: " + Float.MIN_VALUE);
                System.out.println("max: " + Float.MAX_VALUE);
                break;

            case "Double":
                System.out.println("Double range:");
                System.out.println("min: " + Double.MIN_VALUE);
                System.out.println("max: " + Double.MAX_VALUE);
                break;

            default:
                System.out.println("Invalid wrapper class name entered.");
        }

        scanner.close();
    }
}
