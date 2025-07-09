package java_oops;
import java.util.Scanner;
class Employee {
    private String name;
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        this.name = name;
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}

public class oops5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter year started: ");
        int year = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter national insurance number: ");
        String nin = sc.nextLine();

        Employee emp = new Employee(name, salary, year, nin);

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: ₹" + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        sc.close();
    }
}
