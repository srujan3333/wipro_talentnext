package java_junit;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

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

public class TestStringConcat {
    @Test
    public void testConcat() {
        DailyTasks d = new DailyTasks();
        assertEquals("Hello World", d.doStringConcat("Hello", "World"));
    }
}

public class TestSort {
    @Test
    public void testSortValues() {
        DailyTasks d = new DailyTasks();
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, d.sortValues(input));
    }
}

public class TestCheckPresence {
    @Test
    public void testPresenceTrue() {
        DailyTasks d = new DailyTasks();
        assertTrue(d.checkPresence("Hello World", "World"));
    }

    @Test
    public void testPresenceFalse() {
        DailyTasks d = new DailyTasks();
        assertFalse(d.checkPresence("Hello World", "Java"));
    }
}

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})
public class junit4 {
}
