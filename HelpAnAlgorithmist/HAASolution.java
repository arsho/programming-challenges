package HelpAnAlgorithmist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HAASolution {

    public static int linearSearch(int totalLines, String[] compilationStatuses) {
        long startTime = System.nanoTime();
        // TODO Implement the search using linear search

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Linear search took: " + executionTime + " nanoseconds.");
        return 0;
    }

    public static int binarySearch(int totalLines, String[] compilationStatuses) {
        long startTime = System.nanoTime();
        // TODO Implement the search using binary search

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Binary search took: " + executionTime + " nanoseconds.");
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter the relative path of the test case file, e.g.: HelpAnAlgorithmist/test_cases/input_1.txt
        System.out.print("Enter the file path of the test case: ");
        String inputFilePath = scanner.nextLine();
        int lineCount = 0, totalLines = 0;

        ArrayList<String> statuses = new ArrayList<String>();
        try {
            Scanner fileScanner = new Scanner(new File(inputFilePath));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (lineCount == 0) {
                    totalLines = Integer.parseInt(line);
                } else {
                    statuses.add(line);
                }
                lineCount++;
            }
            String[] compilationStatuses = statuses.toArray(new String[statuses.size()]);
            linearSearch(totalLines, compilationStatuses);
            binarySearch(totalLines, compilationStatuses);
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
