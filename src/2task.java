import java.util.Scanner;

public class NegativeElementSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву (n <= 500): ");
        int n = scanner.nextInt();

        if (n > 500) {
            System.out.println("Розмір масиву не може перевищувати 500.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int firstNegativeIndex = -1;
        int lastNegativeIndex = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
                lastNegativeIndex = i;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("В масиві немає від'ємних елементів.");
        } else if (firstNegativeIndex == lastNegativeIndex) {
            System.out.println("В масиві лише один від'ємний елемент.");
        } else {
            int sum = 0;
            for (int i = firstNegativeIndex + 1; i < lastNegativeIndex; i++) {
                sum += array[i];
            }
            System.out.println("Сума елементів між першим та останнім від'ємними елементами: " + sum);
            System.out.println("Діапазон індексів: від " + (firstNegativeIndex + 1) + " до " + (lastNegativeIndex - 1));
        }

        scanner.close();
    }
}
