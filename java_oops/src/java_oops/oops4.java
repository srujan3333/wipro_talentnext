package java_oops;
import java.util.Scanner;
public class oops4 {
    String name;

    public oops4(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter animal name: ");
        String animalName = sc.nextLine();
        oops4 animal = new oops4(animalName);
        animal.eat();
        animal.sleep();

        System.out.print("\nEnter bird name: ");
        String birdName = sc.nextLine();
        Bird bird = new Bird(birdName);
        bird.eat();
        bird.sleep();
        bird.fly();

        sc.close();
    }
}

class Bird extends oops4 {
    public Bird(String name) {
        super(name);
    }
    public void eat() {
        System.out.println(name + " is pecking grains.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping with head under wing.");
    }

    public void fly() {
        System.out.println(name + " is flying in the sky.");
    }
}
