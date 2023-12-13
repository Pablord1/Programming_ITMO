package exceptions;

public class NegativeKnockException extends Exception {
    public NegativeKnockException(){}
    public NegativeKnockException(String errorMessage) {
        super(errorMessage);
    }
    public NegativeKnockException(Throwable err){
        super(err);
    }
    public NegativeKnockException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}