package HelpAnAlgorithmist;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HAATestCaseGenerator {

    public void generateInputTestfile(int testcase, int totalLine, int firstCompilationError) throws IOException {
        String inputFilename = "HelpAnAlgorithmist/test_cases/input_" + testcase + ".txt";
        FileWriter fw = new FileWriter(inputFilename);
        fw.write(totalLine + "\n");
        for (int i = 1; i <= totalLine; i++) {
            if (i < firstCompilationError)
                fw.write("pass\n");
            else
                fw.write("fail\n");
        }
        fw.close();
    }

    public void generateOutputTestfile(int testcase, int firstCompilationError) throws IOException {
        String outputFilename = "HelpAnAlgorithmist/test_cases/output_" + testcase + ".txt";
        FileWriter fw = new FileWriter(outputFilename);
        fw.write(firstCompilationError + "\n");
        fw.close();
    }

    public void generateTestFiles() throws IOException {
        int[] numberOfLines = new int[]{1, 5, 7, 10, 100, 500, 1000, 2000, 3000, 4000, 4500, 4800, 5000};
        for (int testcase = 0; testcase < numberOfLines.length; testcase++) {
            int firstFailedCompilation = 1 + new Random().nextInt(numberOfLines[testcase]);
            generateInputTestfile(testcase + 1, numberOfLines[testcase], firstFailedCompilation);
            generateOutputTestfile(testcase + 1, firstFailedCompilation);
        }
        System.out.println("Genereted " + numberOfLines.length + " testcases. Check test_cases folder.");
    }
}