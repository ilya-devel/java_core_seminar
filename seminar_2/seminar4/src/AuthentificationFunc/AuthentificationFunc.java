package AuthentificationFunc;

public class AuthentificationFunc {
    public static Boolean isValid(String login, String password, String confirmPassword) throws Exception {
        if (login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть меньше 20 символов");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
