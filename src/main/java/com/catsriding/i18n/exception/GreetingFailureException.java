package com.catsriding.i18n.exception;

import org.springframework.http.HttpStatus;

public class GreetingFailureException extends RuntimeException {

    private final String messageKey;
    private final HttpStatus status;

    public GreetingFailureException(String messageKey, HttpStatus status) {
        this.messageKey = messageKey;
        this.status = status;
    }

    public String messageKey() {
        return messageKey;
    }

    public HttpStatus status() {
        return status;
    }
}
