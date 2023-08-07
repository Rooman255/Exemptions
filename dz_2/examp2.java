package dz_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class examp2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Некорректный ввод!");
        } catch (DivisionByZeroException e2) {
            System.out.println(e2.getMessage());
        }
        sc.close();
    }

    public static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        } else {
            System.out.println(a / b);
        }
    }
}   

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}