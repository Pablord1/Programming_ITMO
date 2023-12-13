package exceptions;

public class IncorrectFileNameException extends Exception {
    public IncorrectFileNameException(){}
    public IncorrectFileNameException(String errorMessage) {
        super(errorMessage);
    }
    public IncorrectFileNameException(Throwable err){
        super(err);
    }
    public IncorrectFileNameException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
