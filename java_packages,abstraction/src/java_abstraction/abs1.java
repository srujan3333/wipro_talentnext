package java_abstraction;

import java.util.Scanner;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment";
    }
}

public class abs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of compartments: ");
        int n = sc.nextInt();
        Compartment[] compartments = new Compartment[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter compartment type (1-FirstClass, 2-Ladies, 3-General, 4-Luggage): ");
            int type = sc.nextInt();
            switch (type) {
                case 1 -> compartments[i] = new FirstClass();
                case 2 -> compartments[i] = new Ladies();
                case 3 -> compartments[i] = new General();
                case 4 -> compartments[i] = new Luggage();
                default -> {
                    System.out.println("Invalid input, assigning General by default.");
                    compartments[i] = new General();
                }
            }
        }

        for (Compartment c : compartments) {
            System.out.println(c.notice());
        }
    }
}
