import java.io.IOException;

public class Main {

    public static void printJavaArray(int n, int[][] adjacencyMatrix) {
        System.out.printf("{");
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                if (j == 0)
                    System.out.printf("{");
                System.out.printf("%d", adjacencyMatrix[i][j]);
                if (j < adjacencyMatrix[i].length - 1)
                    System.out.printf(", ");
                else
                    System.out.printf("}");
            }
            if (i < adjacencyMatrix.length - 1)
                System.out.println(",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) throws IOException {
//        HAATestCaseGenerator haa = new HAATestCaseGenerator();
//        haa.generateTestFiles();

//        TATestCaseGenerator ta = new TATestCaseGenerator();
//        ta.generateTestFiles();

    }
}
