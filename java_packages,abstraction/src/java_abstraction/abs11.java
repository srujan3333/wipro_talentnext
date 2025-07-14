package java_abstraction;

import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class abs11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter name of student " + i + ":");
                String name = sc.nextLine();

                int[] marks = new int[3];
                int total = 0;

                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter mark " + (j + 1) + " for " + name + ": ");
                    String input = sc.nextLine();

                    int mark;
                    try {
                        mark = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        throw new NumberFormatException("Invalid input. Please enter integers only.");
                    }

                    if (mark < 0) {
                        throw new NegativeValueException("Negative marks not allowed: " + mark);
                    } else if (mark > 100) {
                        throw new OutOfRangeException("Mark out of range (0-100): " + mark);
                    }

                    marks[j] = mark;
                    total += mark;
                }

                double average = total / 3.0;
                System.out.println("Average marks for " + name + " = " + average);
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (NegativeValueException e) {
            System.out.println("NegativeValueException: " + e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println("OutOfRangeException: " + e.getMessage());
        }

        sc.close();
    }
}
