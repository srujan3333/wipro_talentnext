package java_junit;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

public class junit1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        DailyTasks d = new DailyTasks();
        System.out.println("Concatenated Result: " + d.doStringConcat(s1, s2));
    }
    public void testConcat() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String expected = s1 + " " + s2;
        DailyTasks d = new DailyTasks();
        assertEquals(expected, d.doStringConcat(s1, s2));
    }
}

