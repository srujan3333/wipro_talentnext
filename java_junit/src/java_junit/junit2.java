package java_junit;

import java.util.Arrays;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

class DailyTasks {

    public String doStringConcat(String s1, String s2) {
        return s1 + " " + s2;
    }

    public int[] sortValues(int arr[]) {
        Arrays.sort(arr);
        return arr;
    }

    public boolean checkPresence(String str, String a) {
        return str.contains(a);
    }
}

public class junit2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        DailyTasks d = new DailyTasks();
        int[] sorted = d.sortValues(input);

        System.out.print("Sorted Array: ");
        for (int val : sorted) {
            System.out.print(val + " ");
        }
    }

    @Test
    public void testSortValues() {
        DailyTasks d = new DailyTasks();
        int[] input = {4, 2, 5, 1, 3};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, d.sortValues(input));
    }
}
