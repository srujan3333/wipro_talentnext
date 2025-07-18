package java_io_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class iostr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String filename = sc.nextLine();

        System.out.println("Enter the character to be counted:");
        char target = sc.nextLine().toLowerCase().charAt(0);

        int count = 0;

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                for (char ch : line.toCharArray()) {
                    if (ch == target) {
                        count++;
                    }
                }
            }

            System.out.println("File '" + filename + "' has " + count + " instances of letter '" + target + "'.");
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        sc.close();
    }
}
