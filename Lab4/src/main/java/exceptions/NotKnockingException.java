package exceptions;

public class NotKnockingException extends Exception {
    public NotKnockingException(){}
    public NotKnockingException(String errorMessage) {
        super(errorMessage);
    }
    public NotKnockingException(Throwable err){
        super(err);
    }
    public NotKnockingException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
