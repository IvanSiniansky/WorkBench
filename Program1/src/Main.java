import core.Pair;
import core.PathManager;
import validations.ValidationManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();
        ValidationManager validationManager = new ValidationManager();

        int count = 0;
        int limit = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        limit = getLimitPairs(scanner);

        while (true) {
            if (count == limit) {
                break;
            }

            System.out.println("Введите пару №" + (count + 1) + ":");

            String rawPair = scanner1.nextLine();
            try {
                if (!validationManager.isValid(rawPair)) {
                    System.out.println("Введено некорректное значение!");
                    continue;
                }
                pathManager.addPair(new Pair(rawPair));
            } catch (Exception e) {
                System.out.println("Введено некорретное значение!");
                continue;
            }

            count++;

        }

        System.out.println("Полный путь: " + pathManager.buildFullPath());
    }

    private static int getLimitPairs(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Введите кол-во пар: ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Не удалось считать число. Попробуйте еще раз.");
                scanner.next();
            }
        }
    }
}