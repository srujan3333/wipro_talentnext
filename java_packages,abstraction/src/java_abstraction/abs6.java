package java_abstraction;

import java.util.Scanner;

interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Veena is playing.");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Saxophone is playing.");
    }
}

public class abs6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select instrument to play:");
        System.out.println("1. Veena");
        System.out.println("2. Saxophone");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        Playable instrument;

        if (choice == 1) {
            Veena veena = new Veena();
            veena.play();
            instrument = veena;
        } else if (choice == 2) {
            Saxophone sax = new Saxophone();
            sax.play();
            instrument = sax;
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("Calling play() using Playable reference:");
        instrument.play();

        sc.close();
    }
}
