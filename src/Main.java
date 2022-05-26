import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;
        String operation = "";

        System.out.println("---- Калькулятор ----");
        System.out.println("Ввод производится по схеме: число 1 + <Enter> + операция + <Enter> + число 2");
        System.out.println("Введите число 1:");

        try {
            sc.hasNextInt();
            int number1 = sc.nextInt();

            System.out.println("Введите операцию:");
            operation = sc.next();
            System.out.println("Введите число 2:");

            try {
                sc.hasNextInt();
                int number2 = sc.nextInt();

                switch (operation) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                    default:
                        System.out.println("Операция не распознана. Повторите ввод.");
                }

                System.out.println("Результат = " + result);

            } catch (InputMismatchException number2) {
                System.out.println("Извините, но это не число. Запустите сначала и введите число.");
            }

        } catch (InputMismatchException number1) {
            System.out.println("Извините, но это не число. Запустите сначала и введите число.");
        }


    }
}






