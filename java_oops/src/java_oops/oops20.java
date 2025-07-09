package java_oops;
import java.util.Optional;

public class oops20 {
    public static void main(String[] args) {
        String names[] = new String[5];

        Optional<String> optionalName = Optional.ofNullable(names[0]);

        int length = optionalName.map(String::length).orElse(0);

        System.out.println("Length: " + length);
    }
}
