package java_fundamentals;
public class arr_5 {
	    public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 8, 25, 3};
	        int firstMax = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;
	        int firstMin = Integer.MAX_VALUE;
	        int secondMin = Integer.MAX_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > firstMax) {
	                secondMax = firstMax;
	                firstMax = arr[i];
	            } else if (arr[i] > secondMax && arr[i] != firstMax) {
	                secondMax = arr[i];
	            }
	            if (arr[i] < firstMin) {
	                secondMin = firstMin;
	                firstMin = arr[i];
	            } else if (arr[i] < secondMin && arr[i] != firstMin) {
	                secondMin = arr[i];
	            }
	        }

	        System.out.println("Largest two numbers: " + firstMax + ", " + secondMax);
	        System.out.println("Smallest two numbers: " + firstMin + ", " + secondMin);
	    }
	}


