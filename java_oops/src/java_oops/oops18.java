package java_oops;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class oops18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }

        StringJoiner sj = new StringJoiner(",", "{", "}");
        for (String name : names) {
            sj.add(name);
        }

        System.out.println("Output: " + sj.toString());
        sc.close();
    }
}
