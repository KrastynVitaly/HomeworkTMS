package HomeWork__13.Task_1;

public class LoginInformation {
    public static void dataEntry(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        dataEntryLogin(login);
        dataEntryPassword(password, confirmPassword);
    }

    private static void dataEntryLogin(String login) throws WrongLoginException {
        if (login == null || login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Неверный логин");
        }
    }

    private static void dataEntryPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null || password.length() >= 20 || password.contains(" ") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }

        boolean hasNumber = false;
        for (char a : password.toCharArray()) {
            if (Character.isDigit(a)) {
                hasNumber = true;
                break;
            }
        }

        if (!hasNumber) {
            throw new WrongPasswordException("Пароль должен содержать хоя бы одну цифру");
        }
    }
}
