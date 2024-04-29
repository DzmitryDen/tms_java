/**
 * Task
 * Создать класс, в котором будет статический метод. Этот метод принимает на вход три
 * параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
 * login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
 * необходимо выбросить WrongLoginException. Длина password должна быть меньше 20 символов.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить
 * WrongPasswordException. WrongPasswordException и WrongLoginException -
 * пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Проверить работу метода на валидных и ошибочных данных
 */

public class Main {

    public static void main(String[] args) throws Exception {

        String login = "test";
        String password = "123";
        String confirm = "123";

        String positiveResult = "You are authorized";

        try {
            CredentialValidator.checkCred(login, password, confirm);
        } catch (WrongLoginException exc) {
            String errLoginMessage = "error login";
            throw new WrongLoginException(errLoginMessage);
        } catch (WrongPasswordException exc) {
            String errPasswordMessage = "error password";
            throw new WrongPasswordException(errPasswordMessage);
        }

        System.out.println(positiveResult);
    }
}
