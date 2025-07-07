package java_fundamentals;
import java.util.*;
public class javafundamentals_miniproject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id: ");
		int empId = sc.nextInt();

		int[] empNos = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		String[] empNames = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
		char[] designationCodes = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		String[] departments = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
		int[] basics = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		int[] hra = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		int[] it = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };

		int index = -1;

		for (int i = 0; i < empNos.length; i++) {
			if (empNos[i] == empId) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("There is no employee with empid : " + empId);
			return;
		}

		int daValue = 0;
		String designation = "";
		switch (designationCodes[index]) {
		case 'e':
			designation = "Engineer";
			daValue = 20000;
			break;
		case 'c':
			designation = "Consultant";
			daValue = 32000;
			break;
		case 'k':
			designation = "Clerk";
			daValue = 12000;
			break;
		case 'r':
			designation = "Receptionist";
			daValue = 15000;
			break;
		case 'm':
			designation = "Manager";
			daValue = 40000;
			break;
		}

		int salary = basics[index] + hra[index] + daValue - it[index];

		System.out.println("Emp No.\tEmp Name \tDepartment\t Designation\tSalary");
		System.out.println(empNos[index] + "\t" + "  " +empNames[index] + "\t" + "        " + departments[index] + "\t" + "         " + designation
				+ "\t" + "         "+salary);

	}

}
