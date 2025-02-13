import java.util.Scanner;

public class HW_PRIMITIVES {
    public static void main(String[] args) {
        int earnings = 0;
        int spendings = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход: ");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if (input.trim().equals("end")) {
                break;
            }
            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода");
                    String incomeStr = scanner.nextLine();
                    int income = Integer.parseInt(incomeStr);
                    earnings += income;   //sum of income every circus
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String expenseStr = scanner.nextLine();
                    int expense = Integer.parseInt(expenseStr);
                    spendings += expense;
                    break;
                case 3:
                    taxCompare (earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет. Попробуйте снова.");

            }


        }

        System.out.println("Программа завершена!");
    }


    public static int tax15(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    // 6% Tax method returns Tax amount
    public static int tax6(int earnings) {
        return earnings * 6 / 100;
    }

    public  static void taxCompare (int earnings, int spendings){

int tax6 = tax6(earnings);
int tax15 = tax15(earnings, spendings);

        System.out.println("УСН доходы - налог 6% от доходов: " +tax6 + "руб. "+" от суммы " + earnings + "руб." );
        System.out.println("УСН доходы минус расходы - налог 15%  " + tax15 + " руб. " + "от суммы " + (earnings-spendings) + "руб." );

        if( tax6 > tax15){
            System.out.println("Мы рекоммендуем вам использовать УСН доходы минус расходы - налог 15% ");
            System.out.println("Так вы сможете сэкономить: "+ (tax6 -tax15) + " руб.");
        }else if(tax6 < tax15){
            System.out.println("Мы рекоммендуем вам использовать УСН доходы - налог 6% от доходов");
            System.out.println("Так вы сможете сэкономить: "+ (tax15 - tax6) + " руб.");

        }else{
            System.out.println("Можете выбрать любую систему налогообложения.");
        }


    }

}