package java_abstraction;

import java.util.Scanner;

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Ford extends Vehicle {
    private String modelName, regNo, owner;
    private int speed;

    public Ford(String modelName, String regNo, String owner, int speed) {
        this.modelName = modelName;
        this.regNo = regNo;
        this.owner = owner;
        this.speed = speed;
    }

    public String getModelName() { return modelName; }
    public String getRegistrationNumber() { return regNo; }
    public String getOwnerName() { return owner; }
    public int getSpeed() { return speed; }
    public void tempControl() {
        System.out.println("Air Conditioning is ON in Ford car.");
    }
}

public class abs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to see details of Ford? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter Ford car details:");
            System.out.print("Model: ");
            String fModel = sc.nextLine();
            System.out.print("Reg No: ");
            String fReg = sc.nextLine();
            System.out.print("Owner: ");
            String fOwner = sc.nextLine();
            System.out.print("Speed: ");
            int fSpeed = sc.nextInt();
            sc.nextLine(); 
            Ford ford = new Ford(fModel, fReg, fOwner, fSpeed);

            System.out.println("\n--- Ford Car Details ---");
            System.out.println("Model: " + ford.getModelName());
            System.out.println("Reg No: " + ford.getRegistrationNumber());
            System.out.println("Owner: " + ford.getOwnerName());
            System.out.println("Speed: " + ford.getSpeed());
            ford.tempControl();
        } else {
            System.out.println("No vehicle selected.");
        }

        sc.close();
    }
}
