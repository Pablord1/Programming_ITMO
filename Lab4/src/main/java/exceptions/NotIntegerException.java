package exceptions;

public class NotIntegerException extends Exception {
    public NotIntegerException(){}
    public NotIntegerException(String errorMessage) {
        super(errorMessage);
    }
    public NotIntegerException(Throwable err){
        super(err);
    }
    public NotIntegerException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}

