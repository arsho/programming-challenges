import HelpAnAlgorithmist.HAATestCaseGenerator;
import TemperatureAnalysis.TATestCaseGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HAATestCaseGenerator haa = new HAATestCaseGenerator();
//        haa.generateTestFiles();

        TATestCaseGenerator ta = new TATestCaseGenerator();
        ta.generateTestFiles();

    }
}
