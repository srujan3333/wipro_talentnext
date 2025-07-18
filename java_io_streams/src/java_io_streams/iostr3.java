package java_io_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class iostr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name:");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name:");
        String outputFile = sc.nextLine();

        Map<String, Integer> wordCount = new TreeMap<>();

        try {
            Scanner fileScanner = new Scanner(new File(inputFile));

            while (fileScanner.hasNext()) {
                String word = fileScanner.next().replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            fileScanner.close();

            PrintWriter writer = new PrintWriter(outputFile);
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.println(entry.getKey() + " : " + entry.getValue());
            }

            writer.close();
            System.out.println("Word counts written to output file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        sc.close();
    }
}

