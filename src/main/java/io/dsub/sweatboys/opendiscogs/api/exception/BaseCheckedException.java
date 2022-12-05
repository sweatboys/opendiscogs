package io.dsub.sweatboys.opendiscogs.api.exception;

public abstract class BaseCheckedException extends Exception {
    public BaseCheckedException(String message) {
        super(message);
    }

    public BaseCheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
