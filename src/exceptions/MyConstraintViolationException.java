package exceptions;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

public class MyConstraintViolationException extends Exception {

    public MyConstraintViolationException() {
        super();
    }

    public MyConstraintViolationException(String message) {
        super(message);
    }

    public MyConstraintViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyConstraintViolationException(Throwable cause) {
        super(cause);
    }

    protected MyConstraintViolationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
