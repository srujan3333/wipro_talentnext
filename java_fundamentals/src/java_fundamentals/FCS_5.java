package java_fundamentals;

import java.util.Scanner;

public class FCS_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("Alphabet");
			}
			else if (ch >= '0' && ch <= '9') {
				System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
			

	}

}