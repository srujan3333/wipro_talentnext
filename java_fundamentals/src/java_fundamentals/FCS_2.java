package java_fundamentals;
import java.util.Scanner;
public class FCS_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num % 2 == 0)
        	System.out.println("Even");
        else
        	System.out.println("Odd");
	}

}