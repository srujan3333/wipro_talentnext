package java_oops;
	import java.util.Scanner;
	public class oops8 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String original = sc.nextLine();
	        String reversed = "";

	        for (int i = original.length() - 1; i >= 0; i--) {
	            reversed += original.charAt(i);
	        }

	        if (original.equalsIgnoreCase(reversed)) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }

	        sc.close();
	    }
	}
