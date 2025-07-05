package java_fundamentals;
public class arr_8 {
	    public static void main(String[] args) {
	        int[] arr = {1,6,4,7,9};
	        int sum = 0;
	        boolean inBetween = false;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 6) {
	                inBetween = true;
	            } else if (arr[i] == 7 && inBetween) {
	                inBetween = false;
	            } else if (!inBetween) {
	                sum += arr[i];
	            }
	        }
	        System.out.println(sum);
	    }
	}


