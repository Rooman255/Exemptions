package dz_3.Work_1;

public class PasswordCheck {

    public  PasswordCheck(){
    }

    public void passWordVerifier(String password) throws LenghtExeption, NotContainNumber, NotContainCapitalLetter {
        if (password.length() < 8) {
            throw new LenghtExeption("Пароль должен быть не менее 8 символов");
        }
        if (!checkNumber(password)) {
            throw new NotContainNumber("Пароль должен содержать хотя бы одну цифру");
        }
        if (!checkCapital(password)) {
            throw new NotContainCapitalLetter("Пароль должен содержать хотя бы одну заглавную букву");
        }
        System.out.println("Проверка пройдена успешно");
    }

    public boolean checkNumber(String password) {
        for (int i = 0; i <= 9; i++) {
            String str = Integer.toString(i);
            if (password.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCapital(String password) {
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            String str1 = Character.toString(c);
            if (password.contains(str1)) {
                return true;
            }
        }
        return false;
    }
}