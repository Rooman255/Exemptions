package dz_3.Work_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Введитe пароль: ");
                String password = scanner.nextLine();
                PasswordCheck passwordCheck = new PasswordCheck();
                passwordCheck.passWordVerifier(password);
            }catch (LenghtExeption lengthException){
                System.out.println(lengthException.getMessage());
            }catch (NotContainCapitalLetter containCapitalLetter){
                System.out.println(containCapitalLetter.getMessage());
            }catch (NotContainNumber passwordNotContainNumber){
                System.out.println(passwordNotContainNumber.getMessage());
            }
        }   
    }
}   


