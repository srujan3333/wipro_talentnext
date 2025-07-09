package java_oops;

import java.util.*;

public class oops3 {
    private String name;
    private String email;
    private char gender;

    public oops3(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author's name: ");
        String name = sc.nextLine();

        System.out.print("Enter author's email: ");
        String email = sc.nextLine();

        System.out.print("Enter author's gender (M/F): ");
        char gender = sc.next().charAt(0);

        oops3 author = new oops3(name, email, gender);

        System.out.println("Author Details:");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());

        sc.close();
    }
}
