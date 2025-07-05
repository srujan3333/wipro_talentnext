package java_fundamentals;
import java.util.Scanner;
public class FCS_1b {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 = sc.nextInt();
		int n1 = num1 % 10;
		int n2 = num2 % 10;
		if(n1 == n2) {
			System.out.println("True");
		}
		else 
			System.out.println("False");
	}

}