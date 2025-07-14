package java_abstraction;
import java.util.Scanner;

class foundation {
    private int var1 = 10;
    int var2 = 20;
    protected int var3 = 30;
    public int var4 = 40;
}

public class abs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        foundation obj = new foundation();

        System.out.print("Do you want to access public variable var4? (yes/no): ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            System.out.println("var4 = " + obj.var4);
        } else {
            System.out.println("Access denied.");
        }
    }
}
