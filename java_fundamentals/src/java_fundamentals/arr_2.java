package java_fundamentals;

public class arr_2 {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 5, 40, 15}; 
	        int max = arr[0];
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	            if (arr[i] < min)
	                min = arr[i];
	        }
	        System.out.println("Maximum value in the array: " + max);
	        System.out.println("Minimum value in the array: " + min);
	    }
	}


