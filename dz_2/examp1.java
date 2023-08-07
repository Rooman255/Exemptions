package dz_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class examp1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            int number = sc.nextInt();
            checkNumber(number);
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод!");
        }
        sc.close();
    }

    public static void checkNumber(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        } else {
            System.out.println("Число корректно.");
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
