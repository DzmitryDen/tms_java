public class CredentialValidator {

    public static void checkCred(String login, String password, String confirmPassword) {

        if (login == null || login.isEmpty() || login.length() >= 20) {
            throw new WrongLoginException();
        }

        if (password == null || password.isEmpty() || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
