package java_fundamentals;
import java.util.Scanner;
public class FCS_15 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        int i = 1;
	        while(i <= rows) {
	            int j = 1;
	            while(j <= i) {
	                System.out.print("* ");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	        sc.close();
	    }
	}
