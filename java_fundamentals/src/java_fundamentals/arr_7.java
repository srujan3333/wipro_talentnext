package java_fundamentals;
import java.util.*;
public class arr_7 {
	    public static void main(String[] args) {
	        int[] arr = {12, 34, 12, 45, 67, 89};
	        LinkedHashSet<Integer> set = new LinkedHashSet<>();
	        for (int i = 0; i < arr.length; i++) {
	            set.add(arr[i]);
	        }
	        Integer[] unique = set.toArray(new Integer[0]);
	        System.out.print("{");
	        for (int i = 0; i < unique.length; i++) {
	            System.out.print(unique[i]);
	            if (i != unique.length - 1)
	                System.out.print(",");
	        }
	        System.out.print("}");
	    }
	}
