import java.util.Scanner;

public class MatrixAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір матриці (n × n, 1 ≤ n ≤ 15): ");
        int n = scanner.nextInt();
        if (n < 1 || n > 15) {
            System.out.println("Некоректний розмір матриці. Має бути 1 ≤ n ≤ 15.");
            return;
        }

        int[][] A = new int[n][n];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Рядки з однаковими елементами: ");
        boolean hasUniformRows = false;
        for (int i = 0; i < n; i++) {
            boolean isUniform = true;
            for (int j = 1; j < n; j++) {
                if (A[i][j] != A[i][0]) {
                    isUniform = false;
                    break;
                }
            }
            if (isUniform) {
                System.out.print((i + 1) + " ");
                hasUniformRows = true;
            }
        }
        if (!hasUniformRows) {
            System.out.print("немає");
        }
        System.out.println();

        System.out.print("Стовпці з усіма парними елементами: ");
        boolean hasAllEvenColumns = false;
        for (int j = 0; j < n; j++) {
            boolean allEven = true;
            for (int i = 0; i < n; i++) {
                if (A[i][j] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) {
                System.out.print((j + 1) + " ");
                hasAllEvenColumns = true;
            }
        }
        if (!hasAllEvenColumns) {
            System.out.print("немає");
        }
        System.out.println();

        scanner.close();
    }
}
