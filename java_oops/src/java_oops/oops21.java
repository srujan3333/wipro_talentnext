package java_oops;
import java.util.Optional;
import java.util.Scanner;
public class oops21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter address (Enter to simulate null): ");
        String input = sc.nextLine();
        String address = input.isEmpty() ? null : input;

        Optional<String> optionalAddress = Optional.ofNullable(address);
        String finalAddress = optionalAddress.orElse("India");

        System.out.println("Address: " + finalAddress);

        sc.close();
    }
}
