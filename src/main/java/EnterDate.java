import java.util.Scanner;

public class EnterDate {
    public static void EnterNumbers() {
        String operation = "";
        Scanner sc = new Scanner(System.in);
        sc.hasNextDouble();
        double number1 = sc.nextDouble();
        while (!(operation.equals("/")) && !(operation.equals("+")) && !(operation.equals("*")) && !(operation.equals("-"))) {
            System.out.println("Введите операцию:");
            operation = sc.next();
        }
        System.out.println("Введите число 2:");
        double result=0;
        sc.hasNextDouble();
        double number2 = sc.nextDouble();
        switch (operation) {
            case "+":
                result = Calculate.sum(number1, number2);
                System.out.println("Результат = " + result);
                break;
            case "-":
                result = Calculate.substract(number1, number2);
                System.out.println("Результат = " + result);
                break;
            case "*":
                result = Calculate.multiply(number1, number2);
                System.out.println("Результат = " + result);
                break;
            case "/":
                result = Calculate.divide(number1, number2);
                System.out.println("Результат = " + result);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
    }
}
