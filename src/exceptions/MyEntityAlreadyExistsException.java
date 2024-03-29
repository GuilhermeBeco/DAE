package exceptions;

public class MyEntityAlreadyExistsException extends Exception{
    public MyEntityAlreadyExistsException() {
        super();
    }

    public MyEntityAlreadyExistsException(String message) {
        super(message);
    }

    public MyEntityAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyEntityAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    protected MyEntityAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
