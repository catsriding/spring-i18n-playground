package com.catsriding.i18n.controller;

import com.catsriding.i18n.exception.GreetingFailureException;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GreetingController {

    private final MessageSource messageSource;

    public GreetingController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/greetings")
    public ResponseEntity<?> greeting(
            @RequestParam boolean isRejected
    ) {
        if (isRejected) throw new GreetingFailureException("i18n.errors.rejection", HttpStatus.FORBIDDEN);
        Locale locale = LocaleContextHolder.getLocale();
        String greeting = messageSource.getMessage("i18n.greeting", null, locale);
        return ResponseEntity
                .ok(greeting);
    }
}
