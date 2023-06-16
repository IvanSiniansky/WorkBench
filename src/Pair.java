import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        String From;
        String To;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во пар");
        int limit = scanner.nextInt();
        new PathManager();

        new MaxCitiesTwo();
        new Correct();
        new RepVal();
        LengthCity lengthCity = new LengthCity();


    }
}
