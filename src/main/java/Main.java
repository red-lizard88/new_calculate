import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Калькулятор ----");
        System.out.println("Ввод производится по схеме: число 1 + <Enter> + операция + <Enter> + число 2");
        System.out.println("Введите число 1:");
        try {
            try {
                try {
                    EnterDate.EnterNumbers();
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






