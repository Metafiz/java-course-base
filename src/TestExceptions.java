import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 целых числа:");
        int a = 5, b = 0;
        String sa, sb;
        sa = "3,1415";
        double pi = Double.parseDouble(sa);

        //Integer i = new Integer(123);
        int i = 87;
        Integer intVar = i; // это называется autoboxing
        int j = intVar; // это называется autounboxing


        a = scanner.nextInt();
        b = scanner.nextInt();
        try {
            int c = a / b;
            System.out.printf("Результат деления %d на %d: %d", a, b, c);
        } catch (ArithmeticException ae) {
            System.out.println("Ошибка при вычислениях: " + ae.getMessage());
            ae.printStackTrace();
        }
        System.out.println("Следующие операторы");
    }
}
