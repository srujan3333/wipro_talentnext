package java_fundamentals;
import java.util.Scanner;
public class FCS_7 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a character: ");
		        char ch = sc.next().charAt(0);

		        if (Character.isLowerCase(ch)) {
		            System.out.println(ch + "->" + Character.toUpperCase(ch));
		        } else if (Character.isUpperCase(ch)) {
		            System.out.println(ch + "->" + Character.toLowerCase(ch));
		        } else {
		            System.out.println("Not an alphabet character.");
		        }
		    }
		}


