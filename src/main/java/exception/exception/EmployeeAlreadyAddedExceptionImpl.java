package exception.exception;

public class EmployeeAlreadyAddedExceptionImpl extends EmployeeAlreadyAddedException {
    public EmployeeAlreadyAddedExceptionImpl() {
    }

    public EmployeeAlreadyAddedExceptionImpl(String message) {
        super(message);
    }

    public EmployeeAlreadyAddedExceptionImpl(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAlreadyAddedExceptionImpl(Throwable cause) {
        super(cause);
    }

    public EmployeeAlreadyAddedExceptionImpl(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
