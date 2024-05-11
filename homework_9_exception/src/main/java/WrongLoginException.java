public class WrongLoginException extends RuntimeException{

    public WrongLoginException() {
    }

    public WrongLoginException(String message) throws Exception {
        throw new Exception(message);
    }
}
