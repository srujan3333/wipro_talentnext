package java_oops;
import java.util.Scanner;
import java.util.StringJoiner;
public class oops19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        System.out.print("Enter number of cities in s1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n1; i++) {
            System.out.print("Enter city " + (i + 1) + " for s1: ");
            s1.add(sc.nextLine());
        }

        System.out.print("Enter number of cities in s2: ");
        int n2 = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n2; i++) {
            System.out.print("Enter city " + (i + 1) + " for s2: ");
            s2.add(sc.nextLine());
        }

        StringJoiner merge1 = new StringJoiner("-");
        merge1.add(s1.toString()).add(s2.toString());

        StringJoiner merge2 = new StringJoiner("-");
        merge2.add(s2.toString()).add(s1.toString());

        System.out.println("\ni) s1 merged to s2: " + merge1);
        System.out.println("ii) s2 merged to s1: " + merge2);

        sc.close();
    }
}
