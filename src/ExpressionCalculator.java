import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення n: ");
        double n = scanner.nextDouble();
        System.out.print("Введіть значення m: ");
        double m = scanner.nextDouble();

        double result1 = calculateExpression(n, m);
        System.out.println("Варіант 1 (вхідні дійсні, результат дійсний): " + result1);

        int nInt = (int) n;
        int mInt = (int) m;
        double result2 = calculateExpression(nInt, mInt);
        System.out.println("Варіант 2 (вхідні цілі, результат дійсний): " + result2);

        int result3 = (int) calculateExpression(n, m);
        System.out.println("Варіант 3 (вхідні дійсні, результат цілий): " + result3);

        scanner.close();
    }

    public static double calculateExpression(double n, double m) {
        double numerator = (n + 1) * (m - 4) + n * m - Math.pow(n, 4) + Math.pow(m, 3);
        double denominator = Math.pow(m + 2, 2);
        return numerator / denominator;
    }
}
