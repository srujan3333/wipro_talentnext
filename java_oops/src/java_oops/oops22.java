package java_oops;
import java.util.Optional;
import java.util.Scanner;
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class EmpRecord {
    String name;

    public EmpRecord(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class oops22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name (leave blank for null): ");
        String input = sc.nextLine();

        EmpRecord emp = input.trim().isEmpty() ? null : new EmpRecord(input);

        Optional<EmpRecord> optionalEmp = Optional.ofNullable(emp);

        try {
            EmpRecord validEmp = optionalEmp.orElseThrow(() -> new InvalidEmployeeException("Employee is null!"));
            System.out.println("Employee Name: " + validEmp.getName());
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
