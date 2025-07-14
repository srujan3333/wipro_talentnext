package java_abstraction;

import java.util.Scanner;

interface Test {
    int myFunction(int a, int b, int c);
}

public class abs8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1. Add (t1)");
        System.out.println("2. Multiply (t2)");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Test t1 = (x, y, z) -> x + y + z;
        Test t2 = (x, y, z) -> x * y * z;

        if (choice == 1) {
            System.out.println("Result: " + t1.myFunction(a, b, c));
        } else if (choice == 2) {
            System.out.println("Result: " + t2.myFunction(a, b, c));
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
