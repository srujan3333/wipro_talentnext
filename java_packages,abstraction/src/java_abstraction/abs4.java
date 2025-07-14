package java_abstraction;

import java.util.Scanner;

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {
    private String modelName, registrationNumber, ownerName;
    private int speed;

    public Hero(String modelName, String regNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = regNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public String getModelName() { return modelName; }
    public String getRegistrationNumber() { return registrationNumber; }
    public String getOwnerName() { return ownerName; }
    public int getSpeed() { return speed; }
    public void radio() { System.out.println("Radio is ON in Hero bike."); }
}

class Honda extends Vehicle {
    private String modelName, registrationNumber, ownerName;
    private int speed;

    public Honda(String modelName, String regNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = regNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public String getModelName() { return modelName; }
    public String getRegistrationNumber() { return registrationNumber; }
    public String getOwnerName() { return ownerName; }
    public int getSpeed() { return speed; }
    public void cdplayer() { System.out.println("CD Player is ON in Honda car."); }
}

public class abs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Hero bike:");
        System.out.print("Model Name: ");
        String hModel = sc.nextLine();
        System.out.print("Registration Number: ");
        String hReg = sc.nextLine();
        System.out.print("Owner Name: ");
        String hOwner = sc.nextLine();
        int hSpeed = readValidInt(sc, "Speed: ");

        Hero hero = new Hero(hModel, hReg, hOwner, hSpeed);

        System.out.println("\nEnter details for Honda car:");
        System.out.print("Model Name: ");
        String hoModel = sc.nextLine();
        System.out.print("Registration Number: ");
        String hoReg = sc.nextLine();
        System.out.print("Owner Name: ");
        String hoOwner = sc.nextLine();
        int hoSpeed = readValidInt(sc, "Speed: ");

        Honda honda = new Honda(hoModel, hoReg, hoOwner, hoSpeed);

        System.out.println("\n--- Hero Bike Details ---");
        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println("\n--- Honda Car Details ---");
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/h");
        honda.cdplayer();

        sc.close();
    }

    public static int readValidInt(Scanner sc, String prompt) {
        int num = 0;
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return num;
    }
}
