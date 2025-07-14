package java_abstraction;

import java.util.Scanner;

class Compartment {
    private double height;
    private double width;
    private double breadth;

    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getVolume() {
        return height * width * breadth;
    }
}

public class abs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Compartment c = new Compartment(height, width, breadth);
        System.out.println("Volume: " + c.getVolume());
    }
}
