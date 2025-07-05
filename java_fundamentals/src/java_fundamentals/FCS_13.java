package java_fundamentals;

public class FCS_13 {
	    public static void main(String[] args) {
	        for (int num = 10; num <= 99; num++) {
	            boolean isPrime = true;

	            if (num <= 1)
	                continue;

	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime)
	                System.out.println(num);
	        }
	    }
	}


