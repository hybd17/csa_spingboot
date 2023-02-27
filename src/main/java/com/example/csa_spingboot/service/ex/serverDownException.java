package com.example.csa_spingboot.service.ex;

public class serverDownException extends ServiceException{
    public serverDownException() {
        super();
    }

    public serverDownException(String message) {
        super(message);
    }

    public serverDownException(String message, Throwable cause) {
        super(message, cause);
    }

    public serverDownException(Throwable cause) {
        super(cause);
    }

    public serverDownException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
