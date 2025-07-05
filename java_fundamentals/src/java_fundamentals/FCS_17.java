package java_fundamentals;

import java.util.Scanner;

public class FCS_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit: ");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while (temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;

		}
		if(rev==n) {
			System.out.println(n + " is a Palindrome");
		}
		else {
			System.out.println(n + " is not a Palindrome");
		}

	}

}