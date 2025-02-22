package com.catsriding.i18n.controller;

import com.catsriding.i18n.exception.GreetingFailureException;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GreetingControllerAdvice {

    private final MessageSource messageSource;

    public GreetingControllerAdvice(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(GreetingFailureException.class)
    public ResponseEntity<String> handleRejectionException(
            GreetingFailureException e
    ) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage(e.messageKey(), null, locale);
        return ResponseEntity
                .status(e.status())
                .body(message);
    }

}
