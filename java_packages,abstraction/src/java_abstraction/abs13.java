package java_abstraction;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class abs13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            String input = sc.nextLine();
            int age;

            try {
                age = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Age must be a valid integer.");
            }

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be between 18 and 59.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Valid age. Registration successful.");

        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        sc.close();
    }
}
