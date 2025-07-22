package java_junit;

import java.util.Arrays;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

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

public class junit3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter word to check: ");
        String word = sc.nextLine();

        DailyTasks d = new DailyTasks();
        System.out.println("Presence: " + d.checkPresence(mainStr, word));
    }

    @Test
    public void testSortValues() {
        DailyTasks d = new DailyTasks();
        int[] input = {4, 2, 5, 1, 3};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, d.sortValues(input));
    }

    @Test
    public void testCheckPresence() {
        DailyTasks d = new DailyTasks();
        assertTrue(d.checkPresence("Hello World", "World"));
        assertFalse(d.checkPresence("Hello World", "Java"));
    }
}
