package java_oops;

import java.util.Scanner;

class Fruit {
    String name;
    String taste;
    String size;

    void eat() {
        System.out.println("The fruit is " + name + " and it tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple(String size) {
        this.name = "Apple";
        this.taste = "Sweet and slightly tangy";
        this.size = size;
    }
    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste + ", Size: " + size);
    }
}

class Orange extends Fruit {
    Orange(String size) {
        this.name = "Orange";
        this.taste = "Citrusy and tangy";
        this.size = size;
    }
    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste + ", Size: " + size);
    }
}

public class oops6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Apple: ");
        String appleSize = sc.nextLine();
        Apple apple = new Apple(appleSize);
        apple.eat();

        System.out.print("Enter size of Orange: ");
        String orangeSize = sc.nextLine();
        Orange orange = new Orange(orangeSize);
        orange.eat();

        sc.close();
    }
}
