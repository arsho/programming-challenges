package TemperatureAnalysis;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class TATestCaseGenerator {
    public void generateInputOutputTestfile(int testcase, int totalLine) throws IOException {
        Random random = new Random();
        double mean, median, total = 0.0;
        String inputFilename = "TemperatureAnalysis/test_cases/input_" + testcase + ".txt";
        FileWriter fw = new FileWriter(inputFilename);
        fw.write(totalLine + "\n");
        double[] values = new double[totalLine];
        for (int i = 0; i < totalLine; i++) {
            double value = (random.nextDouble() * (95 - 35)) + 35;
            value = Math.round(value * 10.0) / 10.0;
            values[i] = value;
            total += value;
            fw.write(value + "\n");
        }
        fw.close();
        mean = total / totalLine;
        Arrays.sort(values);
        if (totalLine % 2 == 1) {
            median = values[totalLine / 2];
        } else {
            median = (values[totalLine / 2] + values[(totalLine - 1) / 2]) / 2.0;
        }
        mean = Math.round(mean * 100.0) / 100.0;
        median = Math.round(median * 100.0) / 100.0;
        String outputFilename = "TemperatureAnalysis/test_cases/output_" + testcase + ".txt";
        fw = new FileWriter(outputFilename);
        fw.write(String.format("%.2f", mean));
        fw.write("\n");
        fw.write(String.format("%.2f", median));
        fw.write("\n");
        fw.close();
    }


    public void generateTestFiles() throws IOException {
        int[] numberOfLines = new int[]{4, 5, 7, 10, 10, 30, 45, 55, 65, 72, 87, 95, 100};
        for (int testcase = 0; testcase < numberOfLines.length; testcase++) {
            generateInputOutputTestfile(testcase + 1, numberOfLines[testcase]);
        }
        System.out.println("TATestCaseGenerator: Genereted " + numberOfLines.length + " testcases. Check test_cases folder.");
    }

}
