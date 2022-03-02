package SolveAPuzzle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SAPSolution {

    public static boolean isEulerian(int n, int[][] adjacencyMatrix) {
        // TODO Complete the method
        // Return true if the adjacencyMatrix has 0 or 2 odd degree. Otherwise, return false
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter the relative path of the test case file, e.g.: SolveAPuzzle/test_cases/input_1.txt
        System.out.print("Enter the file path of the test case: ");
        String inputFilePath = scanner.nextLine();
        int numberOfNodes = 0;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        try {
            Scanner fileScanner = new Scanner(new File(inputFilePath));
            boolean firstLine = true;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (firstLine) {
                    numberOfNodes = Integer.parseInt(line);
                    firstLine = false;
                } else {
                    ArrayList<Integer> row = new ArrayList<Integer>();
                    for (String value : line.split(" ")) {
                        row.add(Integer.parseInt(value));
                    }
                    matrix.add(row);
                }
            }
            int[][] adjacencyMatrix = new int[matrix.size()][];
            for (int i = 0; i < matrix.size(); i++) {
                ArrayList<Integer> currentRow = matrix.get(i);
                Integer[] record = new Integer[currentRow.size()];
                record = currentRow.toArray(record);
                int[] row = new int[record.length];
                for (int j = 0; j < record.length; j++) {
                    row[j] = record[j];
                }
                adjacencyMatrix[i] = row;
            }
            System.out.println(isEulerian(numberOfNodes, adjacencyMatrix));
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
