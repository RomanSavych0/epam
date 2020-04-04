package controller.exeptions;

public class DataBaseRuntimeException extends RuntimeException {
    public DataBaseRuntimeException(Throwable cause) {
        super(cause);
    }

    public DataBaseRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
