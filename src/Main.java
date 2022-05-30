import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String operation = "";

        System.out.println("---- Калькулятор ----");
        System.out.println("Ввод производится по схеме: число 1 + <Enter> + операция + <Enter> + число 2");
        System.out.println("Введите число 1:");


        try {
            sc.hasNextInt();
            int number1 = sc.nextInt();


            while (!(operation.equals("/")) && !(operation.equals("+")) && !(operation.equals("*")) && !(operation.equals("-"))) {
                System.out.println("Введите операцию:");
                operation = sc.next();
            }


            System.out.println("Введите число 2:");

            try {

                try {
                    int result;
                    sc.hasNextInt();
                    int number2 = sc.nextInt();


                    switch (operation) {
                        case "+":
                            result = Calculate.summa(number1, number2);
                            System.out.println("Результат = " + result);
                            break;
                        case "-":
                            result = Calculate.subtraction(number1, number2);
                            System.out.println("Результат = " + result);
                            break;
                        case "*":
                            result = Calculate.multiplication(number1, number2);
                            System.out.println("Результат = " + result);
                            break;
                        case "/":
                            result = Calculate.div(number1, number2);
                            System.out.println("Результат = " + result);
                            break;
                        default:
                            System.out.println("Операция не распознана. Повторите ввод.");
                    }


                } catch (InputMismatchException number2) {
                    System.out.println("Извините, но это не число. Запустите сначала и введите число.");
                }
            } catch (ArithmeticException result) {
                System.out.println("Деление на ноль. Запустите сначала и введите число.");
            }


        } catch (
                InputMismatchException number1) {
            System.out.println("Извините, но это не число. Запустите сначала и введите число.");
        }


    }
}






