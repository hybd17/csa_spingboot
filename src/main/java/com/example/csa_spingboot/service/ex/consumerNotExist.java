package com.example.csa_spingboot.service.ex;

public class consumerNotExist extends ServiceException{
    public consumerNotExist() {
        super();
    }

    public consumerNotExist(String message) {
        super(message);
    }

    public consumerNotExist(String message, Throwable cause) {
        super(message, cause);
    }

    public consumerNotExist(Throwable cause) {
        super(cause);
    }

    public consumerNotExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
