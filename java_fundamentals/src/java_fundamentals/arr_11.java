package java_fundamentals;
public class arr_11 {
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 1, 4};
	        boolean flag = true;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 1 && arr[i] != 4) {
	                flag = false;
	                break;
	            }
	        }
	        System.out.println(flag);
	    }
	}


