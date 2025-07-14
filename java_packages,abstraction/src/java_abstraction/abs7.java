package java_abstraction;

import java.util.Scanner;

interface NewVehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface NewFourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

public class abs7 implements NewVehicle, NewFourWheeler {
    @Override
    public void message() {
        System.out.println("Inside Car");
    }

    public void callVehicleMessage() {
        NewVehicle.super.message();
    }

    public void callFourWheelerMessage() {
        NewFourWheeler.super.message();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        abs7 car = new abs7();

        System.out.println("Choose message to display:");
        System.out.println("1. Car only");
        System.out.println("2. Car + Vehicle");
        System.out.println("3. Car + FourWheeler");
        System.out.println("4. Car + Vehicle + FourWheeler");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.println("\n--- Output ---");
        switch (choice) {
            case 1:
                car.message();
                break;
            case 2:
                car.message();
                car.callVehicleMessage();
                break;
            case 3:
                car.message();
                car.callFourWheelerMessage();
                break;
            case 4:
                car.message();
                car.callVehicleMessage();
                car.callFourWheelerMessage();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
