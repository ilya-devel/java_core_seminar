package Shop.Exceptions;

public class WrongBuyerException extends Exception{
    public WrongBuyerException() {
    }

    public WrongBuyerException(String message) {
        super(message);
    }
}
