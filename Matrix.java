import java.util.Arrays;

public class SumOfMetrics {
    void addition() {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        int b[][] = {{3, 4, 6}, {9, 8, 7}, {3, 8, 1}};
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println("Addition" + c[i][j]);
            }
        }
    }

    void multiplication() {
        int e[][] = {{1, 2, 3}, {4, 5, 6},{7,9,1}};
        int f[][] = {{3, 4, 6}, {9, 8, 7},{4,8,2}};
        int g[][] = new int[3][3];
        for (int k = 0; k < 3; k++) {
            for (int m = 0; m < 3; m++) {
                g[k][m] = e[k][m] * f[k][m];
                System.out.println("Multiplication" + g[k][m]);
            }
        }
    }

    void subtraction() {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        int b[][] = {{3, 4, 6}, {9, 8, 7}, {3, 8, 1}};
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.println("Subtraction" + c[i][j]);
            }
        }
    }
    void Division() {
        double e[][] = {{1, 2, 3}, {4, 5, 6},{7,9,1}};
        double f[][] = {{3, 4, 6}, {9, 8, 7},{4,8,2}};
        double g[][] = new double[3][3];
        for (int k = 0; k < 3; k++) {
            for (int m = 0; m < 3; m++) {
                g[k][m] = e[k][m] / f[k][m];
                System.out.println("Division" + g[k][m]);
            }
        }
    }

    public static void main(String[] args) {
        SumOfMetrics s = new SumOfMetrics();
        s.addition();
        s.multiplication();
        s.subtraction();
        s.Division();
    }
}


