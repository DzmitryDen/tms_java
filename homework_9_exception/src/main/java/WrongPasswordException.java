public class WrongPasswordException extends RuntimeException{

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) throws Exception {
        throw new Exception(message);
    }
}
