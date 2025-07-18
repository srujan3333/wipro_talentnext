package java_io_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class iostr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        try {
            File input = new File(inputFile);
            Scanner reader = new Scanner(input);
            PrintWriter writer = new PrintWriter(outputFile);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                writer.println(line);
            }

            reader.close();
            writer.close();
            System.out.println("File is copied.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        sc.close();
    }
}

