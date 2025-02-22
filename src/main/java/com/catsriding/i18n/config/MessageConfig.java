package com.catsriding.i18n.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    // @Bean
    // public MessageSource messageSource() {
    //     ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    //     messageSource.setBasename("messages,errors");
    //     messageSource.setDefaultEncoding("UTF-8");
    //     messageSource.setCacheMillis(3600000);
    //     messageSource.setUseCodeAsDefaultMessage(true);
    //     return messageSource;
    // }
    //
    // @Bean
    // public LocaleResolver localeResolver() {
    //     AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
    //     localeResolver.setDefaultLocale(Locale.KOREA);
    //     localeResolver.setSupportedLocales(List.of(Locale.KOREA, Locale.US, Locale.JAPAN));
    //     return localeResolver;
    // }
}