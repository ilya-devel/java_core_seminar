package Shop.Exceptions;

public class WrongProductException extends Exception{
    public WrongProductException() {
    }

    public WrongProductException(String message) {
        super(message);
    }
}
