package java_abstraction;

import java.util.Scanner;

class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super("User Outside India cannot be registered");
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class abs12 {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException();
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        abs12 ur = new abs12();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter country: ");
        String userCountry = sc.nextLine();

        try {
            ur.registerUser(username, userCountry);
        } catch (InvalidCountryException e) {
            System.out.println("InvalidCountryException: " + e.getMessage());
        }

        sc.close();
    }
}
