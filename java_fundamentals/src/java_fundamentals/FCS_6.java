package java_fundamentals;

import java.util.Scanner;

public class FCS_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Gender : ");
		String gender = sc.nextLine();
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		if (gender.equalsIgnoreCase("female") && (age >= 1 && age <= 58)) {
			System.out.println("The percentage of intrest is : 8.2%");
		} else if (gender.equalsIgnoreCase("female") && (age >= 59 && age <= 100)) {
			System.out.println("The percentage of intrest is : 9.2%");
		} else if (gender.equalsIgnoreCase("male") && (age >= 1 && age <= 58)) {
			System.out.println("The percentage of intrest is : 8.4%");
		} else if (gender.equalsIgnoreCase("male") && (age >= 59 && age <= 100)) {
			System.out.println("The percentage of intrest is : 10.5%");
		}
	}

}