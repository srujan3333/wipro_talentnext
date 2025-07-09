package java_oops;
import java.util.Scanner;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }

    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    
    void draw() {
        System.out.println("Drawing Triangle");
    }

 
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

  
    void erase() {
        System.out.println("Erasing Square");
    }
}

public class oops7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter shape name (Circle, Triangle, Square):");
        String shapeType = sc.nextLine().toLowerCase();

        Shape shape;

        switch (shapeType) {
            case "circle":
                shape = new Circle();
                break;
            case "triangle":
                shape = new Triangle();
                break;
            case "square":
                shape = new Square();
                break;
            default:
                System.out.println("Invalid shape");
                sc.close();
                return;
        }

        shape.draw();
        shape.erase();

        sc.close();
    }
}
