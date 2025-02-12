import java.util.*;

public class HW_COND {

    public static int yearType(int year) {

        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswer = 0;

        while (true) {
            System.out.println("Введите год в формате yyyy:");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int suggestedDays = scanner.nextInt();

            int correctDays = yearType(year);

            if (suggestedDays == correctDays) {
                correctAnswer++;
            } else {
                System.out.println("Неправильно! В этом году " + correctDays + " дней!");
                break;

            }

            System.out.println("Набрано очков: " + correctAnswer);


        }
        scanner.close();
    }
}

